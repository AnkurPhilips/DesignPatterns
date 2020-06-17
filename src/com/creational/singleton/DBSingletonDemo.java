package com.creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSingletonDemo {
    public static void main(String[] args){
        long start,end;
        DBSingleton instance = DBSingleton.getInstance();

        DBSingleton anotherInstance = DBSingleton.getInstance();

        System.out.println(instance.equals(anotherInstance));

        start = System.currentTimeMillis();
        Connection connection = instance.getConnection();
        end = System.currentTimeMillis();

        System.out.println(end-start);

        Statement statement;

        try{
            statement = connection.createStatement();

            statement.executeUpdate("CREATE TABLE ABC( ID INT, NAME VARCHAR(20)) ");

            statement.close();

        }
        catch (SQLException e){

        }

        start = System.currentTimeMillis();
        connection = instance.getConnection();
        end = System.currentTimeMillis();

        System.out.println(end-start);

    }
}
