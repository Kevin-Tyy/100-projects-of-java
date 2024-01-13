package rw.ac.rca.geo;

public class Circle extends Shape{
    double radius;
    public Circle () {
        super();
    }

    //override abstract area method in parent class

    public  Circle(String color, double r){
        super(color);
        this.radius = r;
    }


    //to string method
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);

    }

    @Override
    public String toString() {
        return "The Circle of color " + super.getColor() + ", has radius + " + this.radius +", and area = " + area();
    }
}
