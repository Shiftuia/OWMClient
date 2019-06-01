package ru.shiftuia.weatherapp.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

public class PostgresDaoImpl extends JdbcDaoSupport implements PostgresDao {

    @Autowired
    private DataSource hikariDataSource;

    @PostConstruct
    public void post() {
        setDataSource(hikariDataSource);
    }

}
