package ui.yinwen;

public class Student {
    public String name;
    public int age;
    public double gpa;

//    public Student(String name, int age, double gpa){
//        this.name = name;
//        this.age = age;
//        this.gpa = gpa;
//    }


    public Student(){
        name = "Sample Employee";
        age = 20;
        gpa = 4.0;
    }

    //    public Employee(Employee employee){
//        Employee emp = new Employee();
//        this.name = employee.name;
//        this.id = employee.id;
//        this.dept = new Department("AA", 5);
//
//    }
    // Copy constructor
    public Student(Student student) {
        Student stu = new Student();
        this.name = student.name;
        this.age = student.age;
        this.gpa = student.gpa;
    }

    public void printDetail(){
        System.out.println("Name: " + this.name + " Age: "+ this.age + " GPA: " + this.gpa);
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
