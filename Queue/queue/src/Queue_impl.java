public class Queue_impl {
    static int[] arr= new int[5];
    static int front=-1;
    static int rear=-1;

    public static void enqueue(int data){
        if(rear==arr.length-1){
            System.out.println("queue full");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear++;
        arr[rear]=data;
    }
    public static void dequeue(){
        if(front==-1){
            System.out.println("queue Empty");
            return;
        }
        System.out.println(arr[front]);
        front++;

    }
    public static void peek(){
        if(front==-1){
            System.out.println("empty");
            return;
        }
        System.out.println(arr[front]);

    }
    public static void main(String[] args) {
        enqueue(5);
        enqueue(4);
        enqueue(3);
        enqueue(2);
        enqueue(1);
//        dequeue();
//        dequeue();
//        dequeue();
//        dequeue();
        peek();    }

}
