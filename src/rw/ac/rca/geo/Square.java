package rw.ac.rca.geo;

public class Square extends Shape {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public Square() {
        super();
    }

    //override abstract area method in parent class
    @Override
    public double area () {
        return side * side;
    }

    //to string method
    @Override
    public String toString() {
        return "The square of color " + color + ", has side " + this.side +", and area = " + area();

    }
}
