import java.util.Scanner;

public class ChefHelp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t,n;
        t=sc.nextInt();
        while(t-- > 0){
            n=sc.nextInt();
            if(n<10)
                System.out.println("Thanks for helping Chef!");
            else
                System.out.println("-1");
        }
    }
}
