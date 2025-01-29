public class Fibonacci {
    public static void main(String[] args) {
        int n = 100;
        long[] fib = new long[n];

        fib[0] = 1;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println("First 100 Fibonacci numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + (i < n - 1 ? ", " : "\n"));
        }
    }
}
