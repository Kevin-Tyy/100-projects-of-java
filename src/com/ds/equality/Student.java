/**
 * com.dis.equality
 *
 */
package com.ds.equality;

import java.util.Objects;

/**
 *  * Student class with comparbleTo to facilitate sort, hashCode and equals have been overriden to make sure that Objects of the student class can be compared efficiently
 * This class has information about a student
 * @author Kevin
 *
 */
public class Student implements Comparable {

    /**
     * student's unique email address
     */
    private String email;
    /**
     * student's firstname
     */
    private String firstName;
    /**
     * student's lastname
     */
    private String lastName;
    /**
     * student's code
     */
    private Integer code;

    /**
     * default constructor for this class
     */
    public Student(){
        super();
    }

    /**
     *
     * @param email student's email
     * @param firstName student's firstname
     * @param lastName student's lastname
     * @param code student's unique code
     *
     * parameterized constructor
     */
    public Student(String email, String firstName, String lastName, Integer code) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.code = code;
    }

    /*@Override
    public boolean equals(Object obj){
        Student student = (Student) obj;
        return this.code.equals(student.code) && this.firstName.equals(student.firstName) && this.lastName.equals(student.lastName) && this.email.equals(student.email);
    }
    @Override
    public int hashCode(){
        return this.code.hashCode()+ this.firstName.hashCode() + this.lastName.hashCode() + this.email.hashCode();
    }*/

    /**
     * In the Student class, the equals method is thoughtfully implemented to compare objects for equality based on relevant attributes, such as ID or name.
     * This method overrides the default equals from the Object class, ensuring it aligns with the class's semantics.
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(email, student.email) && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(code, student.code);
    }

    /**
     * In the Student class, the hashCode method is meticulously implemented to generate a unique hash code for each object based on its attributes,
     * promoting efficient usage in hash-based collections. This method ensures that objects with equal attributes produce the same hash code,
     * facilitating proper functioning of data structures like hash tables.
     * The implementation aligns with the class's semantics and overrides the default hashCode from the Object class.
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(email, firstName, lastName, code);
    }

    /**
     * get the email private data member
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     */
    public Integer getCode() {
        return code;
    }

    /**
     * method to update the private code data member
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     *
     * In the Student class, the toString method is implemented to return a string representation of the object, including key attributes like ID and name.
     * This enhances the class's usability by providing a clear and concise representation for developers, simplifying debugging and logging tasks.
     * <ul>
     *     <li>lorem</li>
     *     <li>ipsum</li>
     *     <li>sut</li>
     *     <li>ahmed</li>
     * </ul>
     * @return A string format of a student object
     *
     * @see Object#toString()  Parent class toString
     *
     */
    @Override
    public String toString() {
        return "Student{" +
                "email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", code=" + code +
                '}';
    }

    /**
     * <h2>Overriding the compareTo</h2>
     * In the Student class, the compareTo method is implemented for natural ordering based on a objects attributes.
     * This method follows the Comparable interface, returning a boolean for object equality checks;
     * returns true when two objects have exactly the same attributes equal and false when two objects have different attributes.
     *
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        if (this.code.compareTo(student.code) !=0 )
             return this.code.compareTo(student.code);
        if (this.firstName.compareTo(student.firstName) !=0 )
            return this.firstName.compareTo(student.firstName);

        if(this.lastName.compareTo(student.lastName) != 0)
            return  this.lastName.compareTo(student.lastName);

        return this.email.compareTo(student.email);
    }
}
