package Teoria1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class Numbers {
    public static void main(String[] args) {
//        double a = 0.2;
////        double b = 0.1;
////        double c = a + b;
////        System.out.println(c);
////        System.out.println(c == 0.3);

//        BigDecimal a = new BigDecimal("0.2");  //BigDecimal a = new BigDecimal(0.2); nie zaokragla
//        BigDecimal b = BigDecimal.valueOf(0.1);
//        BigDecimal c = a.add(b);
//        System.out.println(c);

//        long a = 12312344253455446L;
//        long b = 234312344253455446L;
//        long c = a*b;
//        System.out.println(c);
//
//        BigInteger d = new BigInteger("12312344253455446");
//        BigInteger e = new BigInteger("234312344253455446");
//        BigInteger f = d.multiply(e);
//        System.out.println(f);
//zaokraglanie
        BigDecimal a = new BigDecimal("1");
        BigDecimal b = new BigDecimal("3");
//        BigDecimal c = a.divide(b, RoundingMode.HALF_UP);
//        BigDecimal c = a.divide(b, MathContext.DECIMAL64);
        BigDecimal c = a.divide(b, new MathContext(5));//zaokraglenie do 5 miejsce po przecinku
        System.out.println(c);
    }
}
