import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
            

            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n];
            int[] arr2 = new int[n];


            for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++){
            if (arr[i] < x){
            System.out.print(arr[i]+" ");
            }
        }
    }
}