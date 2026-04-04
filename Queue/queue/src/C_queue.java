class C_queue {
    int[] arr;
    int front, rear, size;

    C_queue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // Check if empty
    boolean isEmpty() {
        return front == -1;
    }

    // Check if full
    boolean isFull() {
        return (rear + 1) % size == front;
    }

    // Enqueue
    void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue Full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        arr[rear] = x;
    }

    // Dequeue
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }

        int val = arr[front];

        if (front == rear) {
            front = rear = -1; // last element removed
        } else {
            front = (front + 1) % size;
        }

        return val;
    }

    // Peek
    int peek() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    // Display
    void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }

        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}