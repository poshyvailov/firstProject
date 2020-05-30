package Lesson4;

import javafx.scene.shape.Path;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.Scanner;

public class FileManager {

    public static void main(String[] args) {
        //    /Users/poshivailov 1/IdeaProjects/firstProject/src/Lesson4/ Lesson4FileManager.java

        while (true) {
            Scanner userInput = new Scanner(System.in);

            System.out.println("Select one of the following options:");
            System.out.println("1. Create File");
            System.out.println("2. Remove File");
            System.out.println("3. Show List Of Files");
            System.out.println("4. Rename File");
            System.out.println("5. Show Current Directory Path");
            System.out.println("0. Exit");

            String selectedMenuOption = userInput.nextLine();
            System.out.println("Thanks! You selected: " + selectedMenuOption);

            if ((selectedMenuOption.contains("0")) || (selectedMenuOption.contains("exit")) || (selectedMenuOption.contains("Exit"))) {
                System.out.println("Have a nice day, bye!");
                break;
            }


            switch (selectedMenuOption) {
                case ("1"):
                    System.out.println("Please type file name");
                    String newFileName = userInput.nextLine();
                    createNewFile(newFileName);
                    break;
                case ("2"):



            }
        }
    }


         public static void createNewFile (String newFilename){
             File newFile = new File(newFilename);
             try {
                 if (newFile.createNewFile()){
                     System.out.println("File was successfully created. File name is: " + newFile.getName());
                 } else {
                     System.out.println("File was not created. Try to change file name");
                 }
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }



}