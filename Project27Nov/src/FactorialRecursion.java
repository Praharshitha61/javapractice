public class FactorialRecursion {
    public static void main(String[] args) {
        int n=5;
        int x=fib(n);
        System.out.println(x);
    }

    public static int fib(int n) {
        if(n==1 || n==2)
            return n;
        return fib(n-1)*fib(n-2);
    }
}
