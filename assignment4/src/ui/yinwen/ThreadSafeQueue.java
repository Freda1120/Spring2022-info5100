package ui.yinwen;

import java.util.LinkedList;
import java.util.Queue;

public class ThreadSafeQueue<T> {
    private Queue<T> safeQueue = new LinkedList<>();

    public void add(T data){
        synchronized (safeQueue){
            this.safeQueue.add(data);
        }
    }

    public T remove(){
        synchronized (safeQueue){
            return this.safeQueue.remove();
        }
    }

    public T peek(){
        synchronized (safeQueue){
            return this.safeQueue.peek();
        }
    }

    public boolean isEmpty(){
        synchronized (safeQueue){
            return this.safeQueue.peek() == null;
        }
    }



}
