package Task3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StringsReverseOrder_v2 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        try {
            FileWriter writer = new FileWriter("out.txt");
            FileReader Reader = new FileReader("in.txt");
            Scanner reader = new Scanner(Reader);
            int size = reader.nextInt() + 1;
            for (int i = 0; i < size; i++) {
                strings.add(reader.nextLine());
            }
            System.out.println(strings);
            for (int i = strings.size() - 1; i > 0; i--) {
                writer.write(strings.get(i));
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}