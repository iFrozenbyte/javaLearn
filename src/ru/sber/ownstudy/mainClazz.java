package ru.sber.ownstudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.*;

public class mainClazz {
    
    private static ArrayList<testClass1> profiles = new ArrayList<>();
    
    @SuppressWarnings ("unchecked")
    public static void main(String[] args){
        profiles = (ArrayList < testClass1 >) deSerData("profiles");
        System.out.println("Be4 " + profiles.size());
         testClass1 zPr = new testClass1();
         zPr.setName(JOptionPane.showInputDialog(null, "input your name"));
         zPr.setSurname(JOptionPane.showInputDialog(null, "input your surname"));
         profiles.add(zPr);
         
         for (testClass1 p: profiles){
             System.out.println(p.getName()+"  "+p.surname);
         }
         
         System.out.println("After " + profiles.size());
         serData("profiles", profiles);
    }

    private static Object deSerData(String file_name) {
        Object returnObj = null;
        try {
            FileInputStream fileIn = new FileInputStream(file_name + ".ser");
            ObjectInputStream in  = new ObjectInputStream(fileIn);
            fileIn.close();
            in.close();            
            try {
                returnObj = in.readObject();
            } catch (ClassNotFoundException ex) {
                System.out.println("ClassNotFound");
                System.exit(3);
            }            
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFound");
            System.exit(1);
        } catch (IOException ex) {
            System.out.println("Input/output error");
            System.exit(2);
            //return returnObj;
        }
        return returnObj;
    }

    private static void serData(String file_name, Object obj) {
        try {
            FileOutputStream fileOut = new FileOutputStream(file_name + ".ser");
            ObjectOutputStream out  = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            fileOut.close();
            out.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFound");
            System.exit(1);
        } catch (IOException ex) {
            System.out.println("Input/output error");;
            System.exit(2);
        }
    }    
}