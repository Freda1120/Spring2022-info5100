package ui.yinwen;

import java.util.ArrayList;

public class SeattlePoliceDepartment {
    ArrayList<Person> personList;
    String notification;

    public SeattlePoliceDepartment() {
        this.personList = new ArrayList<>();
    }

    public void NotifyCitizens(String notification){
        this.notification = notification;
        for (Person person: personList) {
            person.getNotification(this);
        }
    }
}
