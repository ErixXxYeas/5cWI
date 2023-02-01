package Datastructures.queue;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        q.dequeue();
        q.enqueue(10);
    }
}
