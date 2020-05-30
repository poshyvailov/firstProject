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
                    System.out.println("Please type file should be removed");
                    String fileForRemove = userInput.nextLine();
                    removeFile(fileForRemove);
                    break;
                case ("3"):
                    getAllFiles();
                    break;
                case ("4"):
                    System.out.println("Type file name that should be renamed");
                    String oldFile = userInput.nextLine();
                    System.out.println("Type new file name");
                    String newFile = userInput.nextLine();
                    renameFile(oldFile, newFile);
                    break;
                case ("5"):
                    showCurrentDirPass();




            }
        }
    }


    public static void createNewFile(String fileName) {
        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File was successfully created. File name is: " + file.getName());
            } else {
                System.out.println("File was not created. Try to change file name");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void removeFile(String fileForRemove) {
        File fileForDel = new File(fileForRemove);
        if (fileForDel.delete()) {
            System.out.println("File " + fileForRemove + "was successfully deleted");
        } else {
            System.out.println("File not found");
        }
    }


    public static void getAllFiles(){
        File curDir = new File(".");
        File [] fileList = curDir.listFiles();
           for(File file : fileList){
               if (file.isFile()){
                   System.out.println(file.getName());
               }
           }
    }


    public static void renameFile(String oldFileName, String newFileName){
        File fileOld = new File(oldFileName);
        File fileNew = new File(newFileName);
        boolean success = fileOld.renameTo(fileNew);
        if (success){
            System.out.println("File was successfully renamed. File name is: " + newFileName);
        } else {
            System.out.println("File with this name is already exists");
        }
    }


    public static void showCurrentDirPass(){
        String dir = System.getProperty("user.dir");
        System.out.println("Current directory pass is: " + dir);
    }



}