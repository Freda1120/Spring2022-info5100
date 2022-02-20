package ui.yinwen;

public class Student extends Person{
    public Student(String name, int age, int id){
        super(name, age, id);
    }
    public void takeQuiz(String quiz){
        System.out.println("Student" + this.name + "takes" + quiz);
    }
}
