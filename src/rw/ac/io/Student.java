package rw.ac.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

class Book implements Serializable {
    private String title;
    private String publisher;
    private int number;

    public Book(String title, String publisher, int number) {
        this.title = title;
        this.publisher = publisher;
        this.number = number;

    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getNumber() {
        return number;
    }
}

public class Student {
    public static String fileName = "object.txt";
    public static String serializeObjectToString(Object obj) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(obj);
            objectOutputStream.close();
            return Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Object deserializeStringToObject(String serialized) {
        try {
            byte[] data = Base64.getDecoder().decode(serialized);
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data));
            return objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void writeToFile(String content) {
        FileWriter writer;
        try {
            writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static String readFile() {
        try {
            return new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    public static void main(String[] args) {
        Book originalBook = new Book("Java Programming", "O'Reilly Media", 12345);

        String serializedBook = serializeObjectToString(originalBook);

        writeToFile(serializedBook);
        String content = readFile();

        Book deserializedBook = (Book) deserializeStringToObject(content);

        if (deserializedBook != null) {
            System.out.println("Original Book: " + originalBook.getTitle() + ", " + originalBook.getPublisher() + ", "
                    + originalBook.getNumber());
            System.out.println("Deserialized Book: " + deserializedBook.getTitle() + ", "
                    + deserializedBook.getPublisher() + ", " + deserializedBook.getNumber());
        }
    }
}