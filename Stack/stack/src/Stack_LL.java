class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Stack_LL {
    static Node head= null;
        public static void push(int data){
            Node n=new Node(data);
            if(head==null){
                n.next=head;
                head=n;
                return;
            }
            n.next=head;
            head=n;

        }
        public static void pop(){
            Node temp=head;
            head=head.next;

        }
        public static void peek(){
            Node temp=head;
            System.out.println(head.data);
        }
        public static void display(){
            Node temp=head;
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }

    static void main(String[] args) {
        push(5);
        push(4);
        push(3);
//        pop();
//        pop();
//        display();
        peek();
        pop();
        peek();
    }


}
