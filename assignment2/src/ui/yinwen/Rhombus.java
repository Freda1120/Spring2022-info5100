package ui.yinwen;


import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


public class Rhombus extends Shape{
    double d1;
    double d2;

    public Rhombus(double d1, double d2) {
        super();
        this.name = "Rhombus";
        this.d1 = d1;
        this.d2 = d2;
    }

    public Rhombus(double d) {
        super();
        this.d1 = d;
        this.d2 = d;
        this.name = "Rhombus";
    }

    @Override
    public double getArea() {
        return d1 * d2 / 2;
    }


    @Override
    public double getPerimeter() {
        return sqrt(pow(d1 / 2, 2) + pow(d2 / 2, 2)) * 4;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }
}
