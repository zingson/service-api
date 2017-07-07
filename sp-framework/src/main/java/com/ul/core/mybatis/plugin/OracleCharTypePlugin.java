package com.ul.core.mybatis.plugin;


import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.plugin.*;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;
import java.util.Properties;


@Intercepts({
        @Signature(type = ResultSetHandler.class,method = "handleResultSets",args = {Statement.class}),
        //@Signature(type = TypeHandler<T>.class,method = "setParameter",args = {PreparedStatement.class,Integer.class,})
})
public class OracleCharTypePlugin implements Interceptor {


    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        /*Object arg = invocation.getArgs()[0];
        if(PreparedStatement.class.equals(arg.getClass())){
            PreparedStatement ps = (PreparedStatement) arg;
            ps.unwrap(OraclePreparedStatement.class).setFixedCHAR(i, parameter);
        }
        Executor
        if(Statement.class.equals(args[0].getClass())){

        }
        */
        List<?> list = (List<?>) invocation.proceed();
        for (Object obj : list) {
            if(obj instanceof Map){ continue; }
            try {
                PropertyDescriptor[] propertyDescriptors =  Introspector.getBeanInfo(obj.getClass()).getPropertyDescriptors();
                for (PropertyDescriptor descriptor:propertyDescriptors) {
                    String propertyName = descriptor.getName();
                    if (propertyName.equals("class")) { continue;}
                    Object result = descriptor.getReadMethod().invoke(obj);
                    if(result!=null&&descriptor.getPropertyType().equals(String.class)) {
                        descriptor.getWriteMethod().invoke(obj,String.valueOf(result).trim());
                    }
                }
            } catch (IntrospectionException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target,this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
