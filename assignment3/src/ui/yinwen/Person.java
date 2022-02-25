package ui.yinwen;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
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

    public void getNotification(SeattlePoliceDepartment police){
        System.out.println("---------------");
        System.out.println("Citizen Name: " + this.getName());
        System.out.println("Notification : " + police.notification);
        System.out.println("---------------");
    }

    public void subscribe(SeattlePoliceDepartment police){
        if(! police.personList.contains(this)){
            police.personList.add(this);
        }
    }

    public void unSubscribe(SeattlePoliceDepartment police){
        police.personList.remove(this);
    }

}
