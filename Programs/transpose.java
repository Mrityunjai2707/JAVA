import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][] = new int[row][cols];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[j][i]);
            }
            System.out.println();
        }
    }
}
