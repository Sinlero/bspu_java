package DataStructures;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(11);
        for (int i = 0; i < stack.size(); i++) {
            stack.push(i);
        }

        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.pop());
        }
    }
}
