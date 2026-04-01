public class Queue_LL {
    static Node front=null;
    static Node rear=null;
    private static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void enqueue(int data){
        Node n=new Node(data);
        //System.out.println(n.data);
        if(rear==null){
            front=rear=n;
            return;
        }
        //System.out.println(n.data);
        rear.next=n;
        rear=n;
        //System.out.println(rear.data);
    }
    public static void dequeue(){
        if(front==null){
            System.out.println("Empty");
            return;
        }
        System.out.println(front.data);
        front=front.next;
    }
    public static void peek(){
        if (front==null){
            System.out.println("Empty");
            return;
        }
    }
    static void main(String[] args) {
        enqueue(5);
        enqueue(4);
        enqueue(3);
        enqueue(2);
        dequeue();
        dequeue();
    }
}
