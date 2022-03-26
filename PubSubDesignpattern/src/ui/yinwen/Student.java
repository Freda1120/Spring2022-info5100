package ui.yinwen;

public class Student extends Person{
    public Student(String name, int id, int age) {
        super(name, id, age);
    }

    public void takeQuiz(Professor professor){
        System.out.println("Professor Name" + professor.getName());
        System.out.println("Student Name" + this.getName());
        System.out.println("Quiz" + professor.quiz);

    }

    public void subscribe(Professor professor){
        if (! professor.students.contains(this)){
            professor.students.add(this);
        }
    }

    public void unsubscribe(Professor professor){
        professor.students.remove(this);
    }
}
