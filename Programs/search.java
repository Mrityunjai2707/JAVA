import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and colunmns of matrix ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int numbers[][] = new int [x][y];
        System.out.println("Enter the elements of matrix : ");
        for(int i = 0 ; i<x ; i++){
            for(int j = 0 ; j<y; j++){
                numbers[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter the number which is to be searched : ");
        int a = sc.nextInt();
        for(int i= 0 ; i<x;i++){
            for(int j =0; j<y;j++){
                if (numbers[i][j]==a){
                    System.out.println("Number " +a+" found at index : "+i+" "+j);
                }
            }
        }
    }
}
