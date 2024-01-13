package rw.ac.rca.mis;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public  static  void  main(String[] args){
        String string = "2015-02-12";
        LocalDate dob = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

        //creating a new Employee of type employee
        Employee p2 = new Employee();
        p2.setAge(14);
        p2.setDob(dob);
        p2.setFirstName("Clark");
        p2.setLastName("Kent");
        p2.setPosition("Instructor");
        p2.setSalary(120);
        p2.setInstitution("RCA");

        System.out.println(p2);

        //using super constructor
        Person employee2 = new Employee(23, "Lois", "Lane", "Daily Planet", "CEO", 5000, LocalDate.parse("1998-02-12", DateTimeFormatter.ISO_DATE));
        System.out.println(employee2);

        employee2.myProfile();
        //employee2.myProfile("Mrs");
    }

}