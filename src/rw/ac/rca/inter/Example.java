package rw.ac.rca.inter;

import java.awt.*;

public interface Example extends Shape, Printable {
    double area();

    void myCustomMethod();
    static void myPrint() {
        System.out.println("From example");
    }

}
