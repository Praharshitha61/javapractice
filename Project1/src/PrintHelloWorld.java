import java.util.Scanner;

public class PrintHelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c = sc.nextInt();
        if (a<b+c && b<a+c && c<b+a) {
            System.out.println("Triangle!!!");
        }
    }
}

