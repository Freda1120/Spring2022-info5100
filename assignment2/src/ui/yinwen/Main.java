package ui.yinwen;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Q1
        Student student1 = new Student(101, "ABC");
        System.out.println("Roll number of the first student: " + student1.getRollNumber());
        System.out.println("Name of the first student: " + student1.getName());
        Student student2 = new Student(student1);
        System.out.println("Roll number of the second student: " + student2.getRollNumber());
        System.out.println("Name of the second student: " + student2.getName());


        // Q2
        Triangle triangle1 = new Triangle(5.0, 6);
        triangle1.printShape();
        System.out.println(triangle1.getArea());
        System.out.println(triangle1.getPerimeter());

        Rhombus rhombus1 = new Rhombus(4, 5);
        rhombus1.printShape();
        System.out.println(rhombus1.getArea());
        System.out.println(rhombus1.getPerimeter());

        // Q3
        Rectangle rectangle1 = new Rectangle(7, 8);
        Circle circle1 = new Circle(7);
        rectangle1.computeArea();
        rectangle1.computePerimeter();
        circle1.computeArea();
        circle1.computePerimeter();
        rectangle1.display();
        circle1.display();


        // Q4
        Player amy = new Player("amy", 6);
        Player bob = new Player("bob", 24);
        Player lily = new Player("lily", 16);
        Player[] players = {amy, bob, lily};
        Arrays.sort(players, new PlayerComparator());
        for (Player p : players) {
            System.out.println(p.getName() + ' ' + p.getScore());
        }


    }


}
