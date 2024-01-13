package code.exp;

import java.io.*;

public class Serialize {
    public static void main(String[] args) {
        Student object = new Student("James" , 20);
        String filename = "object.txt";

        try{
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(object);
            out.close();
            file.close();
            System.out.println("Object has been serialized");


        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        Student object1 = null;
        Student object2 = null;
        try {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            // Method for deserialization of object
            object1 = (Student) in.readObject();
            object2 = (Student) in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized ");
            System.out.println("Name = " + object1.name);
            System.out.println("Age = " + object2.age);

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ec) {
            System.out.println("ClassNotFoundException is caught" + ec.getMessage());
        }

    }
}

class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 7363132668437302432L;

    public String name;
    public int age;

    public Student(String name, int age){
        this.age = age;
        this.name = name;
    }

}
