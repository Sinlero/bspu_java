package Test;

public class Main {
    public static void main(String[] args) {
        Enum x = Enum.third;

        if (x == Enum.second) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
