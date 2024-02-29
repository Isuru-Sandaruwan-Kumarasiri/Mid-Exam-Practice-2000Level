package Queue;

public class Queue {

    Node front;
    Node rear;

    public Queue() {
        this.front = this.rear = null;
    }
    public void enqueue(int data){
        Node newNode=new Node(data);
        if(this.front==null){
            this.front =newNode;
            this.rear=newNode;
        }else{
            this.rear.setNext(newNode);
            rear=newNode;
        }
    }

    public void dequeue(){
        if(this.front==null){
            System.out.println("Queue is Empty");
        }else {
            Node temp=this.front.getNext();
            this.front.setNext(null);
            this.front=temp;

        }
    }
    public void display(){
        Node temp=this.front;
        while (temp!=null){
            System.out.print(temp.getData()+",");
            temp=temp.getNext();
        }
        System.out.println();
    }

}
