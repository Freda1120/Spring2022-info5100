package ui.yinwen;

public class Main {

    public static void main(String[] args) {

        // Q1:
        // Shallow copy: Just point to the memory address.
                        // If the original address changes, the shallow copied object will also change accordingly.
        // Deep copy: Create a new memory address in the computer to store the copied object.
                        // If the original address changes, the deep copied object will not change.

        System.out.println("------------Q1------------");
        Student sample = new Student();
        // deep copy
        Student ashish = new Student(sample);
        ashish.setName("Ashish");
        ashish.setStudentID(2);
        ashish.setGpa((float)3.62);
        // ashish and sample have different information
        ashish.printDetail();
        sample.printDetail();



        // shallow copy
        Student samp = new Student("sample", 1, (float) 3.41);
        Student hello = samp;
        hello.setName("Hello");
        hello.setStudentID(5);
        hello.setGpa((float)3.55);
        // hello and samp have same information
        hello.printDetail();
        samp.printDetail();


	    // Q2:
        // Abstract Class: Use abstract methods. A class can inherit only one Abstract Class.
                        // The function can be implemented and override.
        // Interface: Use abstract and concrete methods. A Class can implement multiple interfaces.
                        // Just state the function but cannot implement it.

        // Q3:
        System.out.println("------------Q3------------");
        Psychiatrist psychiatrist1 = new Psychiatrist("First", new Happy());
        Psychiatrist psychiatrist2 = new Psychiatrist("First", new Sad());


        psychiatrist1.examine(psychiatrist1.moody);
        psychiatrist1.observe(psychiatrist1.moody);
        System.out.println("----------");
        psychiatrist2.examine(psychiatrist2.moody);
        psychiatrist2.observe(psychiatrist2.moody);

        // Q4 is in Class Client

        // Q5:
        System.out.println("------------Q5------------");

        Camera camera1 = Camera.getInstance();
        camera1.setCameraName("Camera 1");

        Camera camera2 = Camera.getInstance();
        System.out.println(camera1.getCameraName());
        System.out.println(camera2.getCameraName());

        camera2.setCameraName("Camera 2");
        System.out.println(camera1.getCameraName());
        System.out.println(camera2.getCameraName());

        // Q6: Please see the Class Question 6


    }


}
