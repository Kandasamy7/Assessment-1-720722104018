import java.util.*;
public class Rotate {
    public static void main(String[] args){
        System.out.println("Enter the 2D array");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); //length
        int n2 = sc.nextInt(); //length
        System.out.println("Enter the elements");
        int[][] a = new int[n1][n2];
        for(int i =0;i<n1 ;i++){
            for(int j = 0;j<n2;j++){
                a[i][j] = sc.nextInt();
                }
            }
            rotate(a, n1, n2);

    }
    static void rotate(int a[][], int n1, int n2){

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if(i>=(n1/2)-1+i && j>=(n1/2)-1+j){
                    a[j][i] = a[i][j];
                }
            }
        }
        for (int i = 0; i <n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
