class Stack_impl{
    static int[] arr=new int[5];
    static int top=-1;
    static void push(int n){
        if(top==arr.length-1){
            System.out.println("full");
        }else {
            top++;
            arr[top]=n;
        }
    }
    static void pop(){
        if(top==-1){
            System.out.println("Empty");
        }
        else {
            System.out.println(arr[top]);
            top--;
        }
    }
    static void peek(){
        if(top==-1){
            System.out.println("Empty");
            return;
        }
        System.out.println(arr[top]);
    }
    static void main(String[] args) {
        push(5);
        push(4);
        push(3);
        push(2);
        push(1);
//        pop();
//        pop();
//        pop();
//        pop();
//        pop();
        peek();

    }
}

