package com.structural.facade;

import com.creational.singleton.DBSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

     DBSingleton instance = null;

     JdbcFacade(){
         instance = DBSingleton.getInstance();
     }

     public int createTable() throws Exception{
         Connection connection = instance.getConnection();

         Statement statement = connection.createStatement();

         int count = statement.executeUpdate("CREATE TABLE Address(ID INTEGER, StreetName VARCHAR(20), City VARCHAR(20))");

         System.out.println("Table created");

         statement.close();

         return count;

     }

     public int insertIntoTable() throws Exception{

         Connection connection = instance.getConnection();

         Statement statement = connection.createStatement();

         int count = statement.executeUpdate("INSERT INTO Address(ID, StreetName, City ) VALUES(1,'1234 SOME STREET','LAYTON')");

         System.out.println(count+" records created");

         statement.close();

         return count;

     }

     public List<Address> getAddresses() throws Exception{

         List<Address> addresses = new ArrayList<>();

         Connection connection = instance.getConnection();

         Statement statement = connection.createStatement();

         ResultSet resultSet = statement.executeQuery("SELECT * FROM Address");

         Address address;

         while (resultSet.next()){

             address = new Address();
             address.setId(resultSet.getString(1));
             address.setStreetName(resultSet.getString(2));
             address.setCity(resultSet.getString(3));
             addresses.add(address);
         }

         statement.close();

         return addresses;

     }
}

class Address{
    private String id;
    private String streetName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String city;

}