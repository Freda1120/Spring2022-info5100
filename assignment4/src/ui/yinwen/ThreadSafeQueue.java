package ui.yinwen;

import java.util.LinkedList;
import java.util.Queue;

public class ThreadSafeQueue<T> {
    private Queue<T> safeQueue;
    public Object lock = new Object();

    public ThreadSafeQueue() {
        this.safeQueue = new LinkedList<>();
    }

    public void add(T data){
        synchronized (lock){
            this.safeQueue.add(data);
        }
    }

    public T remove(){
        synchronized (lock){
            return this.safeQueue.remove();
        }
    }

    public T peek(){
        synchronized (lock){
            return this.safeQueue.peek();
        }
    }

    public boolean isEmpty(){
        synchronized (lock){
            return this.safeQueue.peek() == null;
        }
    }

}
