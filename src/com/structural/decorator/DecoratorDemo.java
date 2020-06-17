package com.structural.decorator;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DecoratorDemo {
    public static void main(String[] args) throws Exception{
//        File file = new File("./output.txt");
//        file.createNewFile();
//        OutputStream outputStream = new FileOutputStream(file); //output stream decorator. FileOutputStream and DataOutputStream concrete decorators
//
//        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
//        dataOutputStream.writeChars("text");
//
//        dataOutputStream.close();
//        outputStream.close();

        Sandwich simpleSandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(simpleSandwich.make());
    }
}
