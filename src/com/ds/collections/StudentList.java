package com.ds.collections;

public class StudentList {
    private int id;
    private String firstName;

    public StudentList(){}

    public StudentList(int id, String firstName) {
        super();
        this.id = id;
        this.firstName = firstName;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Override
    public String toString() {
        return "StudentList{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                '}';
    }

}