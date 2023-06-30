package com.itProgerT4L2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DB {
    private final String HOST = "10.152.36.73";
    private final String PORT = "3306";
    private final String DB_NAME = "arm_vdo";
    private final String LOGIN = "root";
    private final String PASS = "3333";

    private Connection dbConnection = null;
    private Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connStr = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB_NAME ;
        //+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        //jdbc:mysql://localhost:3306/java_db?characterEncoding=UTF-8&useLegacyDatetimeCode=false&serverTimezone=UTC
        Class.forName("com.mysql.cj.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connStr, LOGIN, PASS);
        return dbConnection;

    }

    public void isConnected() throws ClassNotFoundException, SQLException {
        dbConnection = getDbConnection();
        System.out.println(dbConnection.isValid(1000));
    }



}
