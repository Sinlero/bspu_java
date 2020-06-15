package Kursach;

import java.util.Scanner;

public class TranslationSternBrocToFraction {
    int[][] result = {{1,0},
                      {0,1}};
    public static void main(String[] args) {
        TranslationSternBrocToFraction matrix = new TranslationSternBrocToFraction();
        System.out.println("Программа перевода дроби из системы счисления Штерна - Броко");
        System.out.println("Пример ввода: LRRL");
        System.out.print("Введите дробь в формате системы счисления Штерна - Броко: ");
        Scanner in = new Scanner(System.in);
        String[] array = in.nextLine().split("");
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
        for (String s : array) {
            if (!s.equals("L") && !s.equals("R")) {
                System.out.println("Неверный формат ввода");
                System.out.println("Нажмите Enter для закрытия окна");
                in.nextLine();
                System.exit(0);
            }
        }
        int[][] left =   {{1,1},
                          {0,1}};
        int[][] right =  {{1,0},
                          {1,1}};
        for (String s : array) {
            if (s.equals("L")) {
                matrix.multiply(left);
            }
            else {
                matrix.multiply(right);
            }
        }
        int n = matrix.result[0][0] + matrix.result[0][1];
        int m = matrix.result[1][0] + matrix.result[1][1];
        System.out.printf("Дробь: %d/%d\n",m,n);
        System.out.println("Нажмите Enter для закрытия окна");
        in.nextLine();
    }
    public void multiply(int[][] matrix) {
        this.result[0][0] = this.result[0][0] * matrix[0][0] + this.result[0][1] * matrix[1][0];
        this.result[0][1] = this.result[0][0] * matrix[0][1] + this.result[0][1] * matrix[1][1];
        this.result[1][0] = this.result[1][0] * matrix[0][0] + this.result[1][1] * matrix[1][0];
        this.result[1][1] = this.result[1][0] * matrix[0][1] + this.result[1][1] * matrix[1][1];
    }
}
