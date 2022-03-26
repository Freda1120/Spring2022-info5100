package ui.yinwen;

public class Student {
    public String name;
    public int studentID;
    public float gpa;

    public Student(String name, int studentID, float gpa){
        this.name = name;
        this.studentID = studentID;
        this.gpa = gpa;
    }


    public Student(){
        name = "Sample Student";
        studentID = 1;
        gpa = 4.00f;
    }


    // Copy constructor
    public Student(Student student) {
        Student stu = new Student();
        this.name = student.name;
        this.studentID = student.studentID;
        this.gpa = student.gpa;
    }

    public void printDetail(){
        System.out.println("Name: " + this.name + " Age: "+ this.studentID + " GPA: " + this.gpa);
    }


    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



}
