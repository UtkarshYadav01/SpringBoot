package com.ucode.mappers;

import com.ucode.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setName(rs.getString("name"));
        user.setEmail(rs.getString("email"));
        user.setGender(rs.getString("gender"));
        user.setCity(rs.getString("city"));
        return user;
    }
}
