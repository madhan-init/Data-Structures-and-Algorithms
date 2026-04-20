class MinHeap {
    int[] heap;
    int size;
    int capacity;

    MinHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    int left(int i) {
        return 2 * i + 1;
    }

    int right(int i) {
        return 2 * i + 2;
    }

    void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    void insert(int val) {
        if (size == capacity) {
            System.out.println("Heap is full");
            return;
        }

        heap[size] = val;
        int i = size;
        size++;

        // Heapify up
        while (i != 0 && heap[parent(i)] > heap[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    int extractMin() {
        if (size <= 0) return -1;

        if (size == 1) {
            size--;
            return heap[0];
        }

        int root = heap[0];

        // Move last element to root
        heap[0] = heap[size - 1];
        size--;

        heapify(0);

        return root;
    }

    void heapify(int i) {
        int smallest = i;
        int l = left(i);
        int r = right(i);

        if (l < size && heap[l] < heap[smallest])
            smallest = l;

        if (r < size && heap[r] < heap[smallest])
            smallest = r;

        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}

public class Heap_impl {
    public static void main(String[] args) {
        MinHeap h = new MinHeap(10);

        h.insert(10);
        h.insert(5);
        h.insert(20);
        h.insert(2);

        h.printHeap();  // Output: 2 5 20 10

        System.out.println("Extract Min: " + h.extractMin());
        h.printHeap();  // Output after removal
    }
}