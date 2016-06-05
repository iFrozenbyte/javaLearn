package ru.sber.ownstudy;

import java.awt.image.BufferedImage; 
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Main {
    private static MainWindow mainWindow;
    private static BufferedImage image;
    
    public static void main(String[] args) {
        mainWindow = new MainWindow();
    }
    
    public static void setImage(URL url){
        try {
            ImageIO.read(url);
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }
    
    // Перегружаем метод setImage
    public static void setImage(File file){
        try {
            ImageIO.read(file);
        } catch (IOException ex) {
            System.out.println("IOException FILE");
        }
    }
    
    public static void saveImage(File file, String format){
        try {
            ImageIO.write(image, format, file);
        } catch (IOException ex) {
            System.out.println("IOException SAVE_IMAGE");
        }
    }
    
    
    
    
    // Геттеры / Сеттеры
    public static MainWindow getMainWindow() {
        return mainWindow;
    }

    public static void setMainWindow(MainWindow mainWindow) {
        Main.mainWindow = mainWindow;
    }

    public static BufferedImage getImage() {
        return image;
    }

    public static void setImage(BufferedImage image) {
        Main.image = image;
    }    
}