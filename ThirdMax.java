import java.util.Scanner;

public class ThirdMax {
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
            first(a, n1, n2);
        }
   

    static void first(int a[][], int n1, int n2){
        int max = 0;
        int second = 0;
        int third = 0;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (a[i][j] > max) {
                    third = second;
                    second = max;
                    max = a[i][j];
                } else if (a[i][j] > second && a[i][j] < max) {
                    third = second;
                    second = a[i][j];
                } else if (a[i][j] > third && a[i][j] < second) {
                    third = a[i][j];
                }
            }
        }
        if(third == 0){
            System.out.println("third number not available");
        }else{
             System.out.println(third);
        }
       
    
}
}
