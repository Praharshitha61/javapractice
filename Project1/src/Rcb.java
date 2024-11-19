import java.util.Scanner;

public class Rcb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t-- > 0){
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            if(x>y){
                if(x%2==0)
                    System.out.println(x/2);
                else if (x%2!=0)
                    System.out.println();
            }
            else
                System.out.println("0");
        }
    }
}
