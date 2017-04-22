package com.vacoola.booking.dataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by r.vakulenko on 16.04.2017.
 */
public class Db {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost/revenue";
        return DriverManager.getConnection(url, "user", "password");
    }
}
