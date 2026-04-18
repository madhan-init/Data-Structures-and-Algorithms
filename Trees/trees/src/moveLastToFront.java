class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MoveLastToFront {

    // Move last node to front
    static Node moveLastToFront(Node head) {
        if (head == null || head.next == null)
            return head;

        Node secondLast = null;
        Node last = head;

        // Find last and second last
        while (last.next != null) {
            secondLast = last;
            last = last.next;
        }

        // Break link
        secondLast.next = null;

        // Move last to front
        last.next = head;

        return last; // new head
    }

    // Print linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Creating linked list: 10 -> 20 -> 30 -> 40
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.print("Original List: ");
        printList(head);

        head = moveLastToFront(head);

        System.out.print("After Moving Last to Front: ");
        printList(head);
    }
}