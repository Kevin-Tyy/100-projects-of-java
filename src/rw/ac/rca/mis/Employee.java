package rw.ac.rca.mis;

import java.time.LocalDate;

public class Employee extends Person {
    private String institution;
    private String position;
    private long salary;
    public Employee () {
        super();
    }

    public Employee(int age, String firstName, String lastName, String institution, String position, long salary, LocalDate dob) {
        super(age, firstName, lastName, dob);
        this.institution = institution;
        this.position = position;
        this.salary = salary;

    }

    /*
    public Employee(int age, String firstName, String lastName, String institution, String position, long salary, LocalDate dob) {
        this.institution = institution;
        this.position = position;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dob = dob;
    }

    */

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    //method overriding
    public void myProfile () {
        super.myProfile();
        System.out.println("I am " + this.position + " in " + this.institution);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "institution='" + institution + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                '}';
    }
}
