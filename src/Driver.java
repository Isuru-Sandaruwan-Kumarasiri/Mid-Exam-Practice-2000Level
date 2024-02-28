public class Driver {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.InsertFront(1);
        linkedList.InsertFront(2);
        linkedList.InsertFront(3);
        linkedList.InsertFront(4);

        linkedList.display();

        linkedList.InsertRear(5);
        linkedList.display();
        System.out.println( linkedList.search(5));

        linkedList.InsertAtPosition(3,100);
        linkedList.display();

        linkedList.deleteAtPosition(100);
        linkedList.display();
    }
}
