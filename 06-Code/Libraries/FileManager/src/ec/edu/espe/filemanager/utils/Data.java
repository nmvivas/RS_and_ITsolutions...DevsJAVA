/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filemanager.utils;

import java.io.*;

/**
 *
 * @author Group 3
 */
public class Data {

    static int allLines;
    static int totalWords;

    public static void save(String filename, String record) {

                                                                    
        File file = new File(filename);

        FileWriter write;
        FileReader read;

        try {

            write = new FileWriter(file, true);
            read = new FileReader(file);
            BufferedWriter writeA = new BufferedWriter(write);
            BufferedReader readA = new BufferedReader(read);

            writeA.write(record);

            writeA.close();
            while (readA.ready()) {

                String some = readA.readLine();
                System.out.println(some);
            }
            readA.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static String find(String filename, String word) {

        File file = new File(filename);

        String results = "";

        try {
            if (file.exists()) {
                BufferedReader readFile = new BufferedReader(new FileReader(file));
                String readedLine;

                while ((readedLine = readFile.readLine()) != null) {
                    allLines = allLines + 1;
                    String[] words = readedLine.split(" ");
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].equals(word)) {
                            totalWords = totalWords + 1;
                            results = readedLine;
                        }
                    }
                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return results;

    }
    
     public static String findAll (String fileName, String data)
    {
        //TODO code to find information in a file 
        String results;
        results = "Nathaly Vivas, 19, 0990397445\n Gabriel Vivas, 13, 0956871412";
        
        System.out.println(" returning ----> " + results );
        
        return results;
    }
    
    public static boolean remove (String fileName, String data)
    {
        //TODO code to remove information in a file 
        boolean removed;
        
        removed = true;
        
        System.out.println( data + " was removed ");
        
        return removed;
    }
        public static boolean update (String fileName, String data)
    {
        //TODO code to remove information in a file 
        boolean modified;
        
        modified = true;
        System.out.println( data + " was updated ");
        
        return modified;
    }

}
