import java.util.Scanner;

public class Abudant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int a[][] = new int[n][n1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n1;j++){
                a[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for(int i =0;i<n;i++){
            for(int j=0;j<n1;j++){
                if(abundant(a[i][j])){
                    System.out.println(a[i][j]);
                    count++;
                }
            }
        }
        if(count%2==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    static boolean abundant(int n){
        int a = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                a+=i;
            }
        }
        if(a>n){
            return true;
        }
        return false;
    }
}
