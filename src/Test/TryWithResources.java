package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        String text = "qwertyuiop[]\nasdfghjkl;'\nzxcvbnm,./";
        int i;
        try (FileOutputStream outputStream = new FileOutputStream("text.txt");
             FileInputStream inputStream = new FileInputStream("text.txt");
             FileOutputStream copyOutputStream = new FileOutputStream("copy.txt")) {
            int j = 0;
            while (j != text.length() - 1) {
                outputStream.write(text.codePointAt(j++));
            }
            do {
                i = inputStream.read();
                if (i != -1) {
                    System.out.print((char) i);
                    copyOutputStream.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("File wasn't be created");
            e.printStackTrace();
        }
    }
}
