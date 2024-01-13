package code.exp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class XScannerIO {
    public static void main(String[] args) {

        try{
            BufferedReader reader = new BufferedReader((new FileReader("C:\\Users\\user\\Documents\\java-io.txt")));
            String line;
            ArrayList<String> reversedParagraph = new ArrayList<>();

            while ((line =  reader.readLine()) != null){
                String reversedLine = new StringBuilder(line).reverse().toString();
                System.out.println(reversedLine);
                reversedParagraph.add(reversedLine);
            }

            FileWriter fileWriter  = new FileWriter("C:\\Users\\user\\Documents\\java-ioutput.txt");
            for(String sentence : reversedParagraph) {
                fileWriter.write(sentence);
            }

        }catch (IOException e){
            System.out.println(e.toString());
        }
    }

}
