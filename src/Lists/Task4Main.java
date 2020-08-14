package Lists;

import Lists.LinkedList.LinkedListOfStrings;

public class Task4Main {
    public static void main(String[] args) {
        String result = "";
        LinkedListOfStrings list = new LinkedListOfStrings("Hello", "world", "java", "version", "1", "8", "211");
        for (Object o : list) {
            result += o;
        }
        System.out.println(result);
    }
}
