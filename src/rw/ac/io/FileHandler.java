package rw.ac.io;

import java.io.*;

public class FileHandler {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("C:\\Users\\user\\Documents\\java-io.txt");
        OutputStream out = new FileOutputStream("C:\\Users\\user\\Documents\\java-out.txt");
        int[] data =  new int[15];
        int k;
        while ((k = in.read()) != -1){
            System.out.print((char)k);
            out.write(k);
        }
    }
}
