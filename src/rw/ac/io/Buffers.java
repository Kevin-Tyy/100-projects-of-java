package rw.ac.io;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Buffers {
    public static void main(String[] args) throws IOException {
        try{
            //bufferIO();
            scannerIO();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void bufferIO() throws IOException {
        BufferedReader buffer = new BufferedReader(new FileReader("input.txt"));
        String line;

        while ((line = buffer.readLine()) != null){
            System.out.println(line);
        }
    }
    public static void scannerIO () throws FileNotFoundException {
        Scanner scan = new Scanner((new BufferedReader((new FileReader("input.txt")))));

        scan.useDelimiter("[,\n]");
        while (scan.hasNext()){
            String districtCode = scan.next();
            String district = scan.next();
            String provinceCode = scan.next();
            String province = scan.next();

            System.out.println(districtCode + " " + district + " " + provinceCode + "  " + province);

        }
    }

}
