import java.util.Scanner;

public class Chef {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),n,x;
        while(t-- > 0){
            n=sc.nextInt();
            x=sc.nextInt();
            if(n>x){
                if(((n-x)%4)==0)
                    System.out.println((n-x)/4);
                else
                    System.out.println((n-x)/4+1);
            }
            else
                System.out.println("0");
        }
    }
}
