package ui.yinwen;

public class Person {
    public String name;
    public int age;
    public int id;

    public Person(String name, int age, int id){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() { 
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
