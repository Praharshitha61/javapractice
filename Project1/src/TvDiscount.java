import java.util.Scanner;

public class TvDiscount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0) {
            int a,b,c,d;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            if ((a- c) > (b - d))
                System.out.println("First");
            else if ((a - c) < (b - d))
                System.out.println("Second");
            else
                System.out.println("Any");
        }
    }
}
