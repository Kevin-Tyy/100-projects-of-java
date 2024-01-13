package rw.ac.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Stream {
    public static void main(String[] args) {
        System.out.print("Enter file path: ");
        Scanner scanner = new Scanner(System.in);

        String filePath = scanner.nextLine();

        // Specify the path to your text file
        // Replace with the path to your file

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     /*  try {
        Scanner = new Scanner(new File("C:\\Users\\user\\Documents\\java-io.txt"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
}