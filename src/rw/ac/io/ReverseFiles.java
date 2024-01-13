package rw.ac.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseFiles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath;

        System.out.print("Enter file path: ");
        filePath = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            ArrayList<String> sentence = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                String reversedLine = new StringBuilder(line).reverse().toString();

                sentence.add(reversedLine);
            }
            System.out.print("Enter name of new file you want to create : ");
            String fileName = scanner.nextLine();
            FileWriter myWriter = new FileWriter(fileName);
            for (String word : sentence) {
                myWriter.write(word);
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
