class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next=null;
    }
}
class Queue_impl{
    static Node front=null;
    static Node rear=null;

    public static void enqueue(int data){
        Node n=new Node(data);
        if(rear == null){
            front=rear=n;
            return;
        }
        rear.next=n;
        rear=n;
    }
    public static void dequeue(){
        if(front==null){
            System.out.println("empty");
            return;
        }
        System.out.println(front.data);
        front=front.next;
    }

    static void main(String[] args) {
        enqueue(5);
        enqueue(4);
        enqueue(3);
        enqueue(2);
        enqueue(1);
        dequeue();
        dequeue();
        dequeue();

    }

}