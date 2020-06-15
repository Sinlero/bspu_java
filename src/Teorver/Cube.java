package Teorver;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Cube {
    public static void main(String[] args) {
        int[] result = new int[25];
        Map<Integer, Integer> map = new HashMap<>();
        TreeSet<Integer> set = new TreeSet<>();
        int number,counter = 0;
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 4; j++) {
                number = (int)(Math.random()*7);
                if (number == 6) {
                    counter++;
                }
            }
            result[i] = counter;
            set.add(result[i]);
            counter = 0;
        }
        System.out.println(Arrays.toString(result));
        counter = 0;
        for (int i = 0; i < set.size(); i++) {
            for (int value : result) {
                if (set.ceiling(i) != null && value == set.ceiling(i)) {
                    counter++;
                }
            }
            map.put(set.ceiling(i),counter);
            counter = 0;
        }
        System.out.println("Xi = Ni:");
        System.out.println(map);
        for (Integer value : map.values()) {
            System.out.printf("%.2f  ",(double)value/result.length);
        }
    }
}
