import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c,t;
        t=sc.nextInt();
        while(t-- > 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if (a > b && b > c)
                System.out.println(b);
            else
                System.out.println();
        }
    }
}
