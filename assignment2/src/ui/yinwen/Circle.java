package ui.yinwen;

import static java.lang.Math.PI;

public class Circle extends Shape{
    double radius;

    public Circle() {
        super();
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public void computeArea() {
        double area = PI * radius * radius;
        System.out.println("Circle area = " + area);
    }

    public void computePerimeter() {
        double perimeter = PI * 2 * radius;
        System.out.println("Circle Perimeter = " + perimeter);
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Detail of Circle:");
        computeArea();
        computePerimeter();
    }

}
