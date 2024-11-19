import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=1,b=1,c = 0;
        int n=sc.nextInt();
        for(int i=1;i<(n-1);i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
    }
}

/*   (Recursion)
    public static void main(String[] args) {
    int num=sc.nextInt();
        public int fib(int n){
              if(n==0 || n==1)
              return 0;
              else
              return fib(n-1)+fib(n-2);
         }
         System.out.println(fib(n));
      }

 */
