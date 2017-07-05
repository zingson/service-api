package com.ul.core.spring;


import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.type.TypeHandler;

import java.sql.ResultSet;
import java.util.Properties;

@Intercepts({@Signature(type = TypeHandler.class,method = "getResult",args = {ResultSet.class,String.class})})
public class OracleCharTypePlugin implements Interceptor {


    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object[] args = invocation.getArgs();
        ResultSet rs = (ResultSet) args[0];
        String columnName = (String) args[1];
        return rs.getString(columnName).trim();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target,this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
