package ec.edu.espe.simulationcatering.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joel Zeas 
 */
public class FileManager {
    public static ArrayList <String> read(String fileName){
        ArrayList <String> recoveredData = new ArrayList<>();
        
        
        //Exceptions
         try {
            //code to try 
             File file = new File(fileName);
             Scanner reader = new Scanner(file);
             while (reader.hasNextLine()) {
                 recoveredData.add(reader.nextLine());           
             }
             
            reader.close();
             
        } catch (FileNotFoundException ex) {
            //code to manage the error
             System.out.println("An error occured while opening"+fileName+
                     "/n File not found , \nPlease make sure that your"+
                     "file is in the prject folder"+
                     "Please contact the program manager and provider");
             ex.printStackTrace();
        
        }
         
        return recoveredData;
        
    }
    
    public static boolean save(String fileName, String data){
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write(data);
            fileWriter.close();
            return true;
            
        } catch (Exception ex) {
            System.out.println("An error ocurred" +fileName+ "could not be update");
            ex.printStackTrace();
            return false;
        }
    }
}
