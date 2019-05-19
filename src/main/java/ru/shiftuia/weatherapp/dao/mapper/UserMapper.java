package ru.shiftuia.weatherapp.dao.mapper;


import org.springframework.jdbc.core.RowMapper;
import ru.shiftuia.weatherapp.dao.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new User(
                (Long) rs.getObject(1),
                rs.getString(2)
        );
    }
}
