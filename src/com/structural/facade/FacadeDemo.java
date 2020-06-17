package com.structural.facade;

import java.util.List;

public class FacadeDemo {
    public static void main(String[] args) throws Exception{
//        URL url = new URL("http","www.google.com",80,"");
//
//        BufferedReader in = new BufferedReader(
//                new InputStreamReader(url.openStream())
//        );
//
//        String input;
//
//        OutputStream outputStream = new FileOutputStream("./output.txt");
//        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
//
//        while ((input = in.readLine())!=null){
//            System.out.println(input);
//            dataOutputStream.writeChars(input);
//            dataOutputStream.writeChars("hola");
//        }

        JdbcFacade jdbcFacade = new JdbcFacade();

        try{
            jdbcFacade.createTable();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        jdbcFacade.insertIntoTable();
        System.out.println("Record Inserted");

        List<Address> addresses = jdbcFacade.getAddresses();

        for(Address address: addresses){
            System.out.println(address.getId()+","+address.getStreetName()+","+address.getCity());
        }

    }
}
