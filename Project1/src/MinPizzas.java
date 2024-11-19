import java.util.Scanner;

public class MinPizzas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t,x,n,total;
        t=sc.nextInt();
        while(t-- > 0){
            x=sc.nextInt();
            n=sc.nextInt();
            total=x*n;
            if(total%4==0)
                System.out.println(total/4);
            else if(total%4 > 0)
                System.out.println((total/4)+1);
            else
                System.out.println(total/4);
        }
    }
}
