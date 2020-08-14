package Generics;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> integerGen;
        Gen<String> stringGen;
        integerGen = new Gen<>(14);
        stringGen = new Gen<>("JAVA");

        integerGen.showType();
        stringGen.showType();

        int valueInt = integerGen.getObject();
        String valueStr = stringGen.getObject();

        System.out.println("Значение: " + valueInt);
        System.out.println("Значение: " + valueStr);
    }
}
