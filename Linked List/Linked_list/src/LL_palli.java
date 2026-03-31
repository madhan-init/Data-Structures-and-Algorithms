public class LL_palli {
    static Node1 head=null;
    static void main(String[] args) {
        insert_end(5);
    }
    public static void insert_end(int data){
        Node1 new_node=new Node1(data);
        if(head==null){
            new_node.next=head;
            head=new_node;
        }

    }
}
