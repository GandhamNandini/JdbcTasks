package com.stackroute.jdbc;

import java.sql.*;

public class JdbcBatchDemo {
    public void batchdemo()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample", "root", "Root@123");
            Statement statement = connection.createStatement();
            statement.addBatch("insert into employee values(5,'nandu',21,'f')");
            statement.addBatch("insert into employee values(6,'nnnn',21,'f')");
            statement.addBatch("insert into employee values(7,'na',21,'f')");
            statement.addBatch("insert into employee values(8,'nan',21,'f')");
            statement.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}




