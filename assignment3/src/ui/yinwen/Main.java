package ui.yinwen;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person p1 = new Person("Amy", 22);
        Person p2 = new Person("Lily", 28);
        Person p3 = new Person("John", 40);
        Person p4 = new Person("Pony", 12);

        SeattlePoliceDepartment police = new SeattlePoliceDepartment();

        p1.subscribe(police);
        p2.subscribe(police);
        p4.subscribe(police);

        police.NotifyCitizens("Fire alarm: 225 Terry Ave!");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        p2.unSubscribe(police);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        police.NotifyCitizens("Go home now!");



    }
}
