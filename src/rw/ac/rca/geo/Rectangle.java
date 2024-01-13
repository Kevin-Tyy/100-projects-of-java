package rw.ac.rca.geo;

public class Rectangle extends Shape {
    private int length;
    private int width;

    //constructors
    public Rectangle() {
        super();
    }

    public Rectangle(String color, int dimA, int dimB) {
        super(color);
        this.length = dimA;
        this.width = dimB;

    }

    //override abstract area method in parent class
    @Override
    public double area() {
        return length * width;
    }


    //to string method
    @Override
    public String toString() {
        return "The rectangle of color " + super.getColor() + ", has width " + width + ", and length " + length +", has area = " + area();
    }
}
