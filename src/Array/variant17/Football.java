package Array.variant17;

import java.util.Scanner;

public class Football {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество команд: ");
        Table myMatrix = new Table(in.nextInt());
        myMatrix.display();
        System.out.printf("Число команд имеющих больше побед, чем поражений: %d\n", myMatrix.countWins());
        System.out.printf("Номера команд, прошедших турнир без поражений: %s\n", myMatrix.withoutLost().toString());
        System.out.printf("Имеется ли хотя бы одна команда, выигравшая более половины игр: %b\n", myMatrix.winMoreThenHalf());
    }
}
