// Written By: Austin Barnett
// Date: 3/27/2024
// Version 1.0

import java.math.BigInteger;

public class BigRewrite {
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void printFactorialTable(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(i + "! = " + factorial(i));
        }
    }

    public static void main(String[] args) {
        printFactorialTable(30);
    }
}
