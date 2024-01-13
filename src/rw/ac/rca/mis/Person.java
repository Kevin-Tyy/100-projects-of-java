package rw.ac.rca.mis;

import java.time.LocalDate;

public class Person {
    protected int age;
    protected String firstName;
    protected String lastName;
    protected LocalDate dob;
    public Person (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public  Person(){}

    public Person(int age, String firstName, String lastName, LocalDate dob) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void myProfile () {
        System.out.println("I am " + this.firstName + " " + this.lastName);
    }
    public final void myProfile(String title){
        System.out.println("I am " + title + " " + this.firstName + " " + this.lastName);
    }
    public String toString(){
        int years= LocalDate.now().getYear()-this.dob.getYear();
        return  "The person is " + this.firstName + " " + this.lastName+ " and is "+ years + " years Old";
    }


}