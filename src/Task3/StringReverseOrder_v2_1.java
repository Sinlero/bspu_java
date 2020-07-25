package Task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StringReverseOrder_v2_1 {
    public static void main(String[] args) {
        ArrayListOfStrings array;
        try {
            FileReader reader = new FileReader("in.txt");
            FileWriter writer = new FileWriter("out.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            int size = Integer.parseInt(bufferedReader.readLine());
            array = new ArrayListOfStrings(size);
            for (int i = 0; i < size; i++) {
                array.addElem(bufferedReader.readLine());
            }
            for (int i = array.getSize() - 1; i >= 0; i--) {
                System.out.println(array.getElem(i));
                writer.write(array.getElem(i));
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
