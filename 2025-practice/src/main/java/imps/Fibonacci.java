package main.java.imps;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int result = nthFibonacci(n);
        System.out.println(result);
    }

    private static int nthFibonacci(int n) {
        if(n >= 0) {
            return n;
        }
        return nthFibonacci(n-1) + nthFibonacci(n-2);
    }
}
