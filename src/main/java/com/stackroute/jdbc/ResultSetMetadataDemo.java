package com.stackroute.jdbc;

import java.sql.*;

public class ResultSetMetadataDemo {
    public void metadata()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample", "root", "Root@123");

            PreparedStatement statement = connection.prepareStatement("Select * from employee");

            ResultSet resultSet = statement.executeQuery();

            ResultSetMetaData rsmd=resultSet.getMetaData();

            int count=rsmd.getColumnCount();

            System.out.println("Table Name : "+rsmd.getTableName(1));


            System.out.println("Total columns: " +count);

            System.out.println("column Details :");


            for (int i = 1; i <= count; i++)
            {
                //getting column name of index 'i'

                String colName = rsmd.getColumnName(i);

                //getting column's data type of index 'i'

                String colType = rsmd.getColumnTypeName(i);

                System.out.println(colName+" is of type "+colType);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
