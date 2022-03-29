package ui.yinwen;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ThreadSafeQueue<String> q = new ThreadSafeQueue<String>();
        q.add("Lily");
        q.add("Molly");
        q.add("Anne");
        q.add("Kelly");
        System.out.println(q.peek());
        System.out.println(q.remove());
        q.remove();
        q.remove();
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.isEmpty());

    }
}
