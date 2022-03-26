package ui.yinwen;

public abstract class Moody {
    abstract String getMood();

    abstract void ExpressFeelings();

    public void queryMood() {
        System.out.println("I feel Happy(or Sad) today!!");
    }
}
