package rw.ac.rca.soft;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Files {

    static void readFromFile(String filename) throws IOException, FileNotFoundException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    // Handle IOException during close, if necessary
                    System.err.println("Error closing BufferedReader: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        String filename = "example.txt";
        try {
            readFromFile(filename);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
