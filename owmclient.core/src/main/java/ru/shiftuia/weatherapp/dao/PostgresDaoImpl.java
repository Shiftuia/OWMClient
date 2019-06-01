package ru.shiftuia.weatherapp.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Repository
public class PostgresDaoImpl extends JdbcDaoSupport implements PostgresDao {

    @Autowired
    private DataSource hikariDataSource;

    @PostConstruct
    public void post() {
        setDataSource(hikariDataSource);
    }

}
