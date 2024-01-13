package rw.ac.rca.geo;

public abstract class Shape {
    String color;
    public  Shape () {}

    public Shape (String color) {
        this.color = color;
    }

    public abstract double area ();

    @Override
    abstract public String toString();

     public String getColor() {
        return this.color;
    }
}
