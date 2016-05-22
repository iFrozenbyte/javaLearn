package ru.sber.ownstudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Main {
    
    private static ArrayList<Profile> profiles = new ArrayList<Profile>();
    
    @SuppressWarnings ("unchecked")
    public static void main(String[] args){
        profiles = (ArrayList<Profile>) deSerData("profiles");
        System.out.println("Be4 " + profiles.size());
         Profile zProfile = new Profile();
         zProfile.setName(JOptionPane.showInputDialog(null, "input your name"));
         zProfile.setSurname(JOptionPane.showInputDialog(null, "input your surname"));
         profiles.add(zProfile);
         
         for (Profile p: profiles){
             System.out.println(p.getName()+"  "+p.getSurname());
         }         
         System.out.println("After " + profiles.size());
         serData("profiles", profiles);
    }

    private static Object deSerData(String file_name) {
        Object returnObj = null;
        
        try {
            FileInputStream fileIn = new FileInputStream(file_name + ".ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            returnObj = in.readObject();
            fileIn.close();
            in.close();
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFound");
            System.exit(1);
        } catch (IOException ex) {
            System.out.println("IOException");
            System.exit(2);
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException");
        }
            
        return returnObj;
    }

    private static void serData(String file_name, Object obj) {        
        try {
            // Создали поток для файла
            FileOutputStream fileOut = new FileOutputStream(file_name + ".ser");
            
            // Создали поток для объекта
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            
            // После создания потоков в них нужно что_то записать
            objOut.writeObject(obj);
            
            // Закрываем потоки
            fileOut.close();
            objOut.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFound");
            System.exit(1);
        } catch (IOException ex) {
            System.out.println("IO error");
            System.exit(2);
        }
           
    }    
}