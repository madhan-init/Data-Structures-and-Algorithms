public class DetectLoop {
    static Node head=null;
    static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;

        LoopExist(head);
    }

    public static void LoopExist(Node head) {
        Node slow=head;
        Node fast=head;
        while (fast != null && fast.next != null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            System.out.println("Loop exist");
            return;
        }}
    }
}
