package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseMetadataDemo {
            public void databasemetadata()
            {
                Connection con= null;
                DatabaseMetaData dbmd= null;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                try {
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample", "root", "Root@123");
                    dbmd = con.getMetaData();
                    System.out.println("Driver Name: "+dbmd.getDriverName());
                    System.out.println("Driver Version: "+dbmd.getDriverVersion());
                    System.out.println("UserName: "+dbmd.getUserName());
                    System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
                    System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }



            }

}
