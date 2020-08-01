package Test.Treads;

import java.math.BigDecimal;

public class Factorial {

    public static BigDecimal calculate(long value) {
        BigDecimal result = new BigDecimal(1);
        for (int i = 1; i <= value; i++) {
            result = result.multiply(new BigDecimal(i));
            System.out.println(result);
        }
        return result;
    }
}
