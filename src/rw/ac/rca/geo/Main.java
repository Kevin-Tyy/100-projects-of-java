package rw.ac.rca.geo;

public class Main {
    public static void main(String[] args) {
        Rectangle rectA = new Rectangle("Blue", 23, 32);
        Triangle triA = new Triangle("Red", 12, 32);
        Square squA = new Square("Green", 20);
        Circle cirA = new Circle("Purple", 32);

        //calling area method in Parent class ie Shape
        Shape shape = new Shape() {
            @Override
            public double area() {
                return 0;
            }

            @Override
            public String toString() {
                return null;
            }
        };



        //using to string methods
        System.out.println(rectA);
        System.out.println(triA);
        System.out.println(squA);
        System.out.println(cirA);

        //find area for rectangle by overriding area method in parent class from child class
        //System.out.println("The area of the rectangle is: " + rectA.area());

        //find area for triangle by overriding area method in parent class from child class
        //System.out.println("The area of the triangle is: " + triA.area();

        //find area for square by overriding area method in parent class from child class
        //System.out.println("The area of the square is: " + squA.area());
    }
}
