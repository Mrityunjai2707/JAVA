import java.util.Scanner;

public class sumTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];
        for(int i= 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        for(int i = 0 ; i<n-1;i++){
            int a = arr[i];
            for(int j = i+1;j<n;j++){
                int b = arr[j];
                sum = a+b;
                if (sum == target){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
