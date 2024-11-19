public class Fibonacci {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fibonacciSum(n));
    }

    public static int fibonacciSum(int n) {
        int a=0,b=1,c,sum=1;
        for(int i=2;i<n;i++){
            c=a+b;
            sum+=c;
            a=b;
            b=c;
        }
        return sum;
    }
}
