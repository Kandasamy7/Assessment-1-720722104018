import java.util.*;
public class SortMat {
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
            sort(a, n1, n2);
    }
    static void sort(int[][] a, int n1, int n2){
        int temp = 0;

        for(int i = 0; i<n1;i++){
            for(int j = 0;j<n2;j++){
                for (int k = 0; k < n1; k++) {
                    for (int l = 0; l < n2; l++) {
                        if(a[i][j] < a[k][l]){
                            temp = a[i][j];
                            a[i][j] = a[k][l];
                            a[k][l] = temp;

                        }
                    }
                }
            }
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
