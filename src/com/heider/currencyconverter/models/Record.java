package com.heider.currencyconverter.models;

import java.io.*;
import java.time.LocalDate;

public class Record {
    private final String fileName = "History.txt" ;

    public void addRecord(String conversion) {
        try (BufferedWriter file = new BufferedWriter(new FileWriter(fileName, true))) {
            file.write(conversion + "  " + LocalDate.now() + "\n");
            file.write("-------------------------------------------------------------------------------------------\n");
        } catch (IOException e) {
            throw new RuntimeException("Error al escribir en el archivo");
        }

    }

   public void showRecords() {
       try {
           FileReader reader = new FileReader(fileName);
           BufferedReader bufferedReader = new BufferedReader(reader);
           String linea;

           System.out.println("\n-----------------------------------------Historial--------------------------------------------------\n");

           while ((linea = bufferedReader.readLine()) != null) {
               System.out.println(linea);
           }

           System.out.println("\n");
           bufferedReader.close();
       } catch (IOException e) {
           System.out.println(e.getMessage());
       }
   }

}
