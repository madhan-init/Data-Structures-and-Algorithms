import java.util.Scanner;

public class Spiral_mat {
    static void main(String[] args) {
        int r=3;
        int c=3;
        int[][] arr=new int[r][c];
        Scanner in=new Scanner(System.in);
        int left=0;
        int right= arr[0].length-1;
        int top=0;
        int bottom= arr.length-1;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]=in.nextInt();
            }
        }
        while (left<=right && top<=bottom){
            for (int i = left; i <=right ; i++) {
                System.out.println(arr[top][i]);
            }
            top++;
            for (int i = top; i <=bottom ; i++) {
                System.out.println(arr[i][right]);
            }
            right--;
            if(top<=bottom){
                for (int i = right; i>=left ; i--) {
                    System.out.println(arr[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for (int i = bottom; i >=top ; i--) {
                    System.out.println(arr[i][left]);
                }
                left++;
            }

        }


    }
}
