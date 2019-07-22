package com.stackroute.jdbc;

import java.sql.*;

public class JdbcTransactionDemo {
    public void transaction()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample", "root", "Root@123");
            Statement statement = connection.createStatement();
            //connection.setAutoCommit(false);

            Statement stmt=connection.createStatement();
            stmt.executeUpdate("insert into employee values(6,'lbhi',40000,'m')");
            stmt.executeUpdate("insert into employee values(7,'lal',50000,'m')");
            ResultSet resultSet=statement.executeQuery("select * from employee");
            while(resultSet.next())
            {
                System.out.println("Id: " + resultSet.getInt(1) + " Name : " + resultSet.getString(2));
            }
            //connection.commit();
        }
            catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
    }
}
