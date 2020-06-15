package Task3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StringsReversOrder {
    public static void main(String[] args) {
        try {
            FileReader Reader = new FileReader("in.txt");
            Scanner reader = new Scanner(Reader);
            int n = reader.nextInt();
            String[] strings = new String[n+1];
            for (int i = 0; i < n + 1 ; i++) {
                strings[i] = reader.nextLine();
            }
            for (int i = strings.length - 1; i > 0; i--) {
                System.out.println(strings[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}