public class LL_impl {
    static Node head=null;
    static Node tail=null;
    public static void insert_end(int n){
        Node new_node=new Node(n);
        if(head==null){
            head=new_node;
            tail=new_node;
            return;
        }
        tail.next=new_node;
        tail=new_node;
    }
    public static void insert_begining(int n){
        Node new_node=new Node(n);
        if(head == null){
            head=new_node;
            tail=new_node;
            return;
        }
        new_node.next=head;
        head=new_node;
    }
    public static void in_between(int a,int n){
        Node temp=head;
        Node new_node=new Node(n);
        while (temp.data!=a){
            temp=temp.next;
        }
        new_node.next=temp.next;
        temp.next=new_node;
    }
    public static void display(){
        Node temp=head;
        int count=0;
        while (temp!=null){
            System.out.print(temp.data+" ");
            count++;
            temp=temp.next;
        }
        System.out.println("Count is"+" "+count);
    }
    static void main(String[] args) {
        insert_end(5);
        insert_end(6);
        insert_end(7);
        insert_end(8);
        display();
    }
}

