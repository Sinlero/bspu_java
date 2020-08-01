package Test.Treads;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Factorial {

    public static BigDecimal calculate(long value) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        BigDecimal result = new BigDecimal(1);
        for (int i = 1; i <= value; i++) {
            result = result.multiply(new BigDecimal(i));
            System.out.println(decimalFormat.format(result));
//            System.out.println(result);
        }
        return result;
    }
}
