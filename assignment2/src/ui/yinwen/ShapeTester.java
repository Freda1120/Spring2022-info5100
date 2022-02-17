package ui.yinwen;

public class ShapeTester {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(7, 8);
        Circle circle1 = new Circle(7);
        rectangle1.computeArea();
        rectangle1.computePerimeter();
        circle1.computeArea();
        circle1.computePerimeter();
        rectangle1.display();
        circle1.display();

    }
}
