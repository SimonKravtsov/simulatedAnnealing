/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulated.anealing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author kravtz
 */
public class FileReading {
   
   public void file(String fileName){
       try {
            Scanner read =new Scanner(new File(fileName));
            
            
            
            while(read.hasNextLine()){
                String line = read.nextLine();
                while (Character.isWhitespace(line.charAt(0))) {
                                    //remove white space 
                                    line = line.substring(1);}
                //This groups all white spaces as a delimiter.
                String[] lineArray=line.split("\\s+");
                //City city = new City(lineArray[0],Integer.parseInt(lineArray[1]),Integer.parseInt(lineArray[1]));
                SingleTravelManager.addCity(new City(lineArray[0],Double.parseDouble(lineArray[1]),Double.parseDouble(lineArray[2]))); 
                
            }
            
           
            
            
        } catch (FileNotFoundException ex) {
           System.out.println("FILE NOT FOUND \n"+ex);
                   
        }
   }
}
