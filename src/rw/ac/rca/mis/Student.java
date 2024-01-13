package rw.ac.rca.mis;

import rw.ac.rca.mis.Person;

public class Student extends Person {
    private String grade;
    private String school;
    private String Combination;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCombination() {
        return Combination;
    }

    public void setCombination(String combination) {
        Combination = combination;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade='" + grade + '\'' +
                ", school='" + school + '\'' +
                ", Combination='" + Combination + '\'' +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                '}';
    }
}
