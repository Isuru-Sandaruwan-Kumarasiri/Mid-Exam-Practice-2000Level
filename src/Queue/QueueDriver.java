package Queue;

public class QueueDriver {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        q.display();
        q.dequeue();
        q.display();
    }

}
