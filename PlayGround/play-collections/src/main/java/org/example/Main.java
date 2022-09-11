package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Mohammed Sakir
 * @since 13-07-2022
 */
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        BufferedReader br = new BufferedReader(new FileReader("/Users/sakir/Downloads/tempjson.txt"));
        String everything = "";
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            br.close();
        }

        try{
            Gson gson = new GsonBuilder().serializeNulls().create();
            String value = gson.toJson(everything);
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}