package rw.ac.io;

import java.io.*;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
/*        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("C:\\Users\\user\\Documents\\java-io.txt");
            out = new FileOutputStream("C:\\Users\\user\\Documents\\output.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        System.out.println("Program finished");*/



        StringBuilder string = new StringBuilder("Kevin").reverse();
        System.out.println(string);
    }
    public static void FileReaderS(String[] args) throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;
        try {
            inputStream = new FileReader("input.txt");
            outputStream = new FileWriter("cput.txt");
            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
