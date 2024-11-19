import java.util.Scanner;

public class ChefPhn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t,x;
        t=sc.nextInt();
        while(t-- > 0){
            x=sc.nextInt();
            if(x<=15)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
