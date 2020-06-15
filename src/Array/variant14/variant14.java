package Array.variant14;

public class variant14 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int sum = 0, max;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 200 - 100);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            max = matrix[i][0];
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
                if (i == j && matrix[i][j] < 0) {
                    for (int value : matrix[i]) {
                        sum += value;
                        max = Integer.max(max, value);
                    }
                }
                if (j == matrix.length - 1) {
                    if (sum != 0) {
                        System.out.printf("\t\tСумма эл-ов строки = %d, наибольший элемент строки = %d", sum, max);
                    }
                }
            }
            sum = 0;
            System.out.println();
        }
    }
}
