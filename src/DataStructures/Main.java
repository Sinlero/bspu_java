package DataStructures;

import DataStructures.Stack.DynamicStack;
import DataStructures.Stack.FixedStack;
import DataStructures.Stack.PrimitiveStack;

public class Main {
    public static void main(String[] args) {
        FixedStack<String> stringFixedStack = new FixedStack<>(10);
        PrimitiveStack<Double> doublePrimitiveStack = new PrimitiveStack<>(10);
        DynamicStack<Integer> integerDynamicStack = new DynamicStack<>(10);

    }
}
