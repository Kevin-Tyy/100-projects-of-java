package rw.ac.rca.geo;

public class Triangle extends Shape{
    private int height;
    private int base;
    public Triangle() {
        super();
    }
    public Triangle(String color, int height, int base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    //override abstract area method in parent class (super class)
    @Override
    public double area() {
        return (double) (height * base) / 2;
    }

    //to string method
    @Override
    public String toString() {
        return "The triangle of color " + super.getColor() + ", height of " + base + " and base of " + height +", has area = " + area();

    }
}

