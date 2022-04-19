package Nadejn;

public class three {
    public static void main(String[] args) {
        double mantisa = Math.pow(10, -5);
        int[] counts = {1, 5, 3, 1, 1};
        double[] lambdas = {2.16, 0.23, 0.32, 0.78, 0.09};
        int t = 5000;
        double res = 1;
        double elem;
        for (int i = 0; i < lambdas.length; i++) {
            elem = Math.pow(1 - Math.pow((lambdas[i] * mantisa * t), 2), counts[i]);
            System.out.println(elem);
            res *= elem;
        }
        System.out.printf("Вероятность безотказной работы системы = %f", res);
    }
}
