package Kursach;

import java.util.ArrayList;
import java.util.Scanner;

public class TranslationToSternBrocSystem {
    public static void main(String[] args) {
        System.out.println("Программа перевода дроби в систему счисления Штерна - Броко");
        System.out.println("Пример ввода дроби: 5/7");
        System.out.print("Введите дробь: ");
        ArrayList<String> result = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String[] array = in.nextLine().split("/");
        int m = Integer.parseInt(array[0]);
        int n = Integer.parseInt(array[1]);
        if (m == n) {
            result.add("I");
        }
        while (m != n) {
            if (m < n) {
                n -= m;
                result.add("L");
            }
            else {
                m -= n;
                result.add("R");
            }
        }
        System.out.print("В системе счисления Штерна - Броко дробь будет иметь следующий вид: ");
        for (String s : result) {
            System.out.printf("%s",s);
        }
        System.out.println();
        System.out.println("Нажмите Enter для закрытия окна");
        in.nextLine();
    }
}
