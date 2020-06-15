package Crypt;

public class simple {
    public static void main(String[] args) {
        simp(133);
        mn(133);
        nod(6,18);
    }
    public static void simp(int value) {
        for (int i = 2; i <= value; i++) {
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                }
                else {
                    System.out.println(i);
                }
                break;
            }
        }
    }
    public static void mn(int value) {
        for (int i = 0; i <= value; i++) {
            for (int j = i; j <= value; j++) {
                if (i*j==value){
                    System.out.printf("%d * %d = %d\n",i,j,value);
                }
            }
        }
    }
    public static void nod(int x, int y) {
        int min = Math.min(x, y);
        for (int i = min; i > 0; i--) {
            if (x%i==0 && y%i==0) {
                System.out.println(i);
                break;
            }
        }
    }
}
