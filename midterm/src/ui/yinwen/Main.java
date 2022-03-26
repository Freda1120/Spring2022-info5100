package ui.yinwen;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // Q1:
        // Shallow copy: Just point to the copied memory address. If the original address changes, the shallow copied object will also change accordingly.
        // Deep copy: Create a new memory address in the computer to store the copied object.

        System.out.println("------------Q1------------");
        Student sample = new Student();
        // deep copy
        Student ashish = new Student(sample);
        ashish.setName("Ashish");
        ashish.setStudentID(2);
        ashish.setGpa((float)3.62);
        ashish.printDetail();
        sample.printDetail();



        // shallow copy
        Student samp = new Student("sample", 1, (float) 3.4);
        Student freda = samp;
        freda.setName("Freda");
        freda.setStudentID(5);
        freda.setGpa((float)3.55);
        freda.printDetail();
        samp.printDetail();


	    // Q2:
        // Abstract Class: Use abstract methods. A class can inherit only one Abstract Class.
                        // The function can be implemented and override.
        // Interface: Use abstract and concrete methods. A Class can implement multiple interfaces.
                        // Just state the function but cannot implement it.

        // Q3:
        System.out.println("------------Q3------------");
        Psychiatrist psychiatrist1 = new Psychiatrist("First", new Happy());
        Psychiatrist psychiatrist2 = new Psychiatrist("First", new Happy());


        psychiatrist1.examine(psychiatrist1.moody);
        psychiatrist1.observe(psychiatrist1.moody);
        psychiatrist1.toString();
        System.out.println("----------");
        psychiatrist2.examine(psychiatrist2.moody);
        psychiatrist2.observe(psychiatrist2.moody);
        psychiatrist2.toString();

        // Q4 is in Class Client

        // Q5:
        System.out.println("------------Q5------------");

        Camera cam1 = Camera.getInstance();

        cam1.setCameraName("Camera 1");

        Camera cam2 = Camera.getInstance();
        System.out.println(cam1.getCameraName());
        System.out.println(cam2.getCameraName());

        cam2.setCameraName("Camera 2");
        System.out.println(cam1.getCameraName());
        System.out.println(cam2.getCameraName());

        // Q6: Please see the Class Question 6


    }











}
