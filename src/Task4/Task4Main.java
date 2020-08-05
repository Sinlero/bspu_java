package Task4;

public class Task4Main {
    public static void main(String[] args) {
        LinkedListOfStrings list = new LinkedListOfStrings("Hello", "World", "Java", "Version-1.8.0_211");
        String result = "";
        for (Object o : list) {
            result += o;
        }
        System.out.println(result);
    }
}
