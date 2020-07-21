package DataStructures;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        IntegerArray array = new IntegerArray();
        array.add(1);
        array.add(2);
        array.add(3);
        for (int i = 0; i < array.getSize(); i++) {
            System.out.println(array.get(i));
        }
    }
}
