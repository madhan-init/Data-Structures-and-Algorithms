

public class CLL {
    static Node head = null;
    static Node tail = null;

    // 🔹 Insert at end
    public static void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // circular link
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head; // maintain circular
    }

    // 🔹 Insert at beginning
    public static void insertBegin(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = head; // update tail link
    }

    // 🔹 Delete from beginning
    public static void deleteBegin() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        head = head.next;
        tail.next = head;
    }

    // 🔹 Delete from end
    public static void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = head;
        tail = temp;
    }

    // 🔹 Display
    public static void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    // 🔹 Main method
    public static void main(String[] args) {
        insertEnd(10);
        insertEnd(20);
        insertEnd(30);

        insertBegin(5);

        display(); // 5 -> 10 -> 20 -> 30 -> (back to head)

        deleteBegin();
        display();

        deleteEnd();
        display();
    }
}