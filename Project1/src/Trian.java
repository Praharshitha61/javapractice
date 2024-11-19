import java.util.Scanner;

public class Trian {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if((a+b)>c && (c+b)>a && (a+c)>b)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
