package com.creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.sqlite.JDBC;


public class DBSingleton {
    private static volatile DBSingleton instance = null;
    private static String sqlPath = "jdbc:sqlite:src/com/creational/bankaccount/database.db";
    private static volatile Connection connection = null;

    private DBSingleton(){
        if(instance!=null){
            throw new RuntimeException("Use getInstance() method to create");
        }

        if(connection!=null){
            throw new RuntimeException("Use getInstance() method to create");
        }

    }

    public static DBSingleton getInstance(){
        if(instance==null) {
            synchronized (DBSingleton.class) {
                if(instance==null)
                    instance = new DBSingleton();
            }
        }
        return instance;
    }

    public Connection getConnection(){
        if(connection==null){
            synchronized (DBSingleton.class){
                if (connection==null){
                    try{
                        connection =  JDBC.createConnection(sqlPath,new Properties());
                    }
                    catch (SQLException e){
                        e.printStackTrace();
                        System.out.println(e);
                    }
                    catch (Exception e){
                        System.out.println(e);
                        e.printStackTrace();
                    }
                }
            }
        }
        return connection;
    }

}
