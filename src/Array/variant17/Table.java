package Array.variant17;

import java.util.ArrayList;
import java.util.Scanner;

public class Table {
    private int[][] matrix;
    private int size;

    Table(int size) {
        this.size = size;
        init();
    }

    public int[][] init() {
        Scanner in = new Scanner(System.in);
        this.matrix = new int[size][size];
        System.out.println("Введите таблицу очков(нули по главной диагонали выставятся автоматически)");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = in.nextInt();
                }
            }
        }
        return this.matrix;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public ArrayList<Integer> withoutLost() {
        ArrayList<Integer> teams = new ArrayList<>();
        int lossCounter = 0;
        int teamNumber;
        for (int i = 0; i < size; i++) {
            teamNumber = i;
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] == 0) {
                    lossCounter++;
                }
            }
            if (lossCounter == 1) {
                teams.add(++teamNumber);
            }
            lossCounter = 0;
        }
        return teams;
    }

    public int countWins() {
        int counterWins = 0;
        int counterLoss = -1;
        int counter = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] == 2) {
                    counterWins++;
                }
                if (matrix[i][j] == 0) {
                    counterLoss++;
                }
            }
            if (counterWins > counterLoss) {
                counter++;
            }
            counterWins = 0;
            counterLoss = 0;
        }
        return counter;
    }

    public boolean winMoreThenHalf() {
        int counter = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] == 2) {
                    counter++;
                }
            }
            if (counter > (size / 2)) {
                break;
            }
            counter = 0;
        }
        return counter > (size / 2);
    }
}