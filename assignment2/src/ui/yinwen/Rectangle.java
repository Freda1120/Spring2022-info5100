package ui.yinwen;

public class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle() {
        super();
    }

    public Rectangle(double length, double width) {
        this.name = "Rectangle";
        this.length = length;
        this.width = width;
    }

    public void computeArea() {
        double area = length * width;
        System.out.println("Rectangle area = " + area);

    }

    public void computePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Rectangle perimeter = " + perimeter);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Detail of Rectangle:");
        computeArea();
        computePerimeter();
    }
}
