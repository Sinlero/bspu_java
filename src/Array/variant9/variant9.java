package Array.variant9;

import java.util.Scanner;

public class variant9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] matrix = new int [n][m];
        int max = 0, rezult = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int)(Math.random()*100);
                System.out.print(matrix[i][j] + " ");
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            System.out.println();
            rezult += max;
        }
        System.out.println("Сумма наибольших значений элементов всех строк" + rezult);
    }
}
