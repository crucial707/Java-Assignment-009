// Written by: Austin Barnett
// Date: 3/27/2024
// Version 1.0
public class Big {
    public static int pow(int x, int n) {
        if (n == 0) return 1;
        int t = pow(x, n / 2);
        if (n % 2 == 0) {
            return t * t;
        } else {
            return t * t * x;
        }
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
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
