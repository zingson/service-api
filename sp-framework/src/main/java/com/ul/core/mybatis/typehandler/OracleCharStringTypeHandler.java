package com.ul.core.mybatis.typehandler;

import oracle.jdbc.driver.OraclePreparedStatement;
import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.type.*;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 自定义 TypeHandler 处理Oracle Char类型长度问题
 */
public class OracleCharStringTypeHandler extends StringTypeHandler {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
        ps.unwrap(OraclePreparedStatement.class).setFixedCHAR(i, parameter);
        //ParameterHandler
    }

    @Override
    public String getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return rs.getString(columnName).trim();
    }

    @Override
    public String getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return rs.getString(columnIndex).trim();
    }

    @Override
    public String getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return cs.getString(columnIndex).trim();
    }

}