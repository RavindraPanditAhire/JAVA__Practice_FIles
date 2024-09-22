public class Queue_LL {

    // keep track of front and rear Node
    static Node front;
    static Node rear;
    int size;

    // Node definition for  Queue data structure
    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void enqueue(int data){
        Node newNode = new Node(data);

        if (front == null) {
            newNode.next = front;
            front = rear = newNode;
            size += 1;
            System.out.println(data+" added as front");
            return;
        }

        rear.next = newNode;
        rear = newNode;
        size += 1;
        System.out.println(data+" added as Tail");
    }

    // function for dispaly Queue
    public void display(){
        if (front == null) {
            System.out.println("Queue is empty...Nothing to Display...");
            return;
        }

        Node temp=front;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    // function for deleting the nodes from Queue
    public void dequeue(){
        if (front == null) {
            System.out.println("Queue is Empty...nothing to delete...");
            return;
        }

        Node deletedItem=front;
        front = front.next;
        size -= 1;
        System.out.println(deletedItem.data+" deleted from Queue");
        if (front == null) {
            rear = null;
        }
    }

    // function for getting the size of Queue
    public void getSize(){
        System.out.println("Size: "+size);
    }

    // function to get front Node
    public Node getFront(){
        return front;
    }

    // function to get Rear Node
    public Node getRear(){
        return rear;
    }

    // main methhod
    public static void main(String[] args) {
        Queue_LL q = new Queue_LL();
        q.display();
        q.getSize();

        q.enqueue(10);
        q.getSize();
        System.out.println("Front: "+q.getFront().data);
        System.out.println("Rear: "+q.getRear().data);
        q.enqueue(20);
        q.getSize();
        System.out.println("Front: "+q.getFront().data);
        System.out.println("Rear: "+q.getRear().data);
        q.enqueue(30);
        q.getSize();
        System.out.println("Front: "+q.getFront().data);
        System.out.println("Rear: "+q.getRear().data);
        q.enqueue(40);
        q.getSize();
        System.out.println("Front: "+q.getFront().data);
        System.out.println("Rear: "+q.getRear().data);
        q.enqueue(50);
        q.getSize();
        System.out.println("Front: "+q.getFront().data);
        System.out.println("Rear: "+q.getRear().data);

        q.display();

        q.dequeue();
        q.getSize();
        System.out.println("Front: "+q.getFront().data);
        System.out.println("Front: "+q.getRear().data);
        q.display();
    }
}

