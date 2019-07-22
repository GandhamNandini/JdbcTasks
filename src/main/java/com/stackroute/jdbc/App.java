package com.stackroute.jdbc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //SimpleJdbcDemo simpleJdbcDemo = new SimpleJdbcDemo();
        //simpleJdbcDemo.getEmployeeDetails();
        //simpleJdbcDemo.getEmployeeDetailsInReverse();
        //simpleJdbcDemo.getEmployeeDetailsFromSecondRowInReverse();
        //simpleJdbcDemo.getEmployeeDetailsByNameAndGender("nandini",'f');
        ResultSetMetadataDemo demo=new ResultSetMetadataDemo();
        demo.metadata();

        DatabaseMetadataDemo dbdemo=new DatabaseMetadataDemo();
        dbdemo.databasemetadata();


        RowSetDemo rowdemo=new RowSetDemo();
        rowdemo.set();


        JdbcBatchDemo batch =new JdbcBatchDemo();
        batch.batchdemo();


        JdbcTransactionDemo transactionDemo=new JdbcTransactionDemo();
        transactionDemo.transaction();
    }
}
