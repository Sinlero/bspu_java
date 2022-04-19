package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HRnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^tac(tac(tic)?)*$");
        Matcher matcher = pattern.matcher(scanner.nextLine());
        if (matcher.find()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
