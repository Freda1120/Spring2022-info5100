package ui.yinwen;

public class Triangle extends Shape {
    double base;
    double height;

    public Triangle(double v, double side) {
        super();
        this.perimeter = side * 3;
        this.name = "Triangle";
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        super.getPerimeter();
        return this.perimeter;
    }

    @Override
    public double getArea() {
        super.getArea();
        double area;
        if (base == 0 || height == 0) {
            double side = getPerimeter() / 3;
            area = ((Math.sqrt(3) / 4) * side * side);
        } else {
            area = base * height / 2;
        }
        return area;
    }

}
