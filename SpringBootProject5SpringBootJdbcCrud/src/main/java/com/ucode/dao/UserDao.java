package com.ucode.dao;

import com.ucode.entity.User;
import com.ucode.mappers.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean insertUser(User user) {
        boolean status = false;
        try {
            final String INSERT_SQL_QUERY = "INSERT INTO users(name, email, gender, city) VALUES(?, ?, ?, ?)";
            int i = jdbcTemplate.update(INSERT_SQL_QUERY, user.getName(), user.getEmail(), user.getGender(), user.getCity());
            if (i > 0) {
                status = true;
            } else {
                status = false;
            }
        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }
        return status;
    }

    public boolean updateUser(User user) {
        boolean status = false;
        try {
            final String UPDATE_SQL_QUERY = "UPDATE users SET name=?, gender=?, city=? WHERE email=?";
            int i = jdbcTemplate.update(UPDATE_SQL_QUERY, user.getName(), user.getGender(), user.getCity(), user.getEmail());
            if (i > 0) {
                status = true;
            } else {
                status = false;
            }
        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }
        return status;
    }

    public boolean deleteUserByEmail(String email) {
        boolean status = false;
        try {
            final String DELETE_SQL_QUERY = "DELETE FROM users WHERE email=?";
            int i = jdbcTemplate.update(DELETE_SQL_QUERY, email);
            if (i > 0) {
                status = true;
            } else {
                status = false;
            }
        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }
        return status;
    }

    public User getUserByEmail(String email) {
        boolean status = false;
        final String SELECT_SQL_QUERY = "SELECT * FROM users WHERE email=?";
        return jdbcTemplate.queryForObject(SELECT_SQL_QUERY, (rs, rowNum) -> {
            User user = new User();
            user.setName(rs.getString("name"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setCity(rs.getString("city"));
            return user;
        },email );
    }

    public List<User> getAllUsers() {
        boolean status = false;
        final String SELECT_SQL_QUERY = "SELECT * FROM users";
        return jdbcTemplate.query(SELECT_SQL_QUERY, new UserRowMapper());
    }

}
