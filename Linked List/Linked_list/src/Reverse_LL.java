import java.util.Arrays;

class Node1{
    int data;
    Node1 next;

    public Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

class Reverse_LL{
    static Node1 head=null;
    static Node1 tail=null;
    public static void insert_end(int n){
        Node1 new_node=new Node1(n);
        if(head==null){
            head=new_node;
            tail=new_node;
            return;
        }
        tail.next=new_node;
        tail=new_node;
    }
    static void main(String[] args) {
        insert_end(5);
        insert_end(4);
        insert_end(3);
        insert_end(2);
        insert_end(1);
        reverse_ll(head);
        display();
    }
    public static void display(){
        Node1 temp=head;
        int count=0;
        while (temp!=null){
            System.out.print(temp.data+" ");
            count++;
            temp=temp.next;
        }
        System.out.println("Count is"+" "+count);
    }
    public static void reverse_ll(Node1 head) {
    Node1 prev=null;
    while (head!=null){
        Node1 next=head.next;
        head.next=prev;
        prev=head;
        head=next;
    }
    Reverse_LL.head=prev;
    }
}