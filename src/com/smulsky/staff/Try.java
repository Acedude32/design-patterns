package com.smulsky.staff;

import java.math.BigDecimal;

public class Try {
    public static void main(String[] args) {
/*
        Double a = new Double(1.0);
        Double b = new Double(3.01);
        BigDecimal result = new BigDecimal(a).multiply(new BigDecimal(b));
        System.out.println((Double)result.doubleValue());
*/

        Double a = new Double(1.0);
        Double b = new Double(3.01);


        System.out.println(multiply(a, b));
    }

    public static Double multiply(Double a, Double b) {
        BigDecimal result = new BigDecimal(a).multiply(new BigDecimal(b));
        return result.doubleValue();
    }

}
