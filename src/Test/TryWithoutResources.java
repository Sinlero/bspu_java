package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithoutResources {
    public static void main(String[] args) {
        String text = "qwertyuiop[]\nasdfghjkl;'\nzxcvbnm,./";
        int i;
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("text.txt");
            int j = 0;
            while (j != text.length() - 1) {
                outputStream.write(text.codePointAt(j++));
            }
            outputStream.close();
            inputStream = new FileInputStream("text.txt");
            outputStream = new FileOutputStream("copy.txt");
            do {
                i = inputStream.read();
                if (i != -1) {
                    System.out.print((char) i);
                    outputStream.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("File wasn't be created");
            e.printStackTrace();
        }
        finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error with close input stream");
                e.printStackTrace();
            }
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error with close output stream");
                e.printStackTrace();
            }
        }
    }
}
