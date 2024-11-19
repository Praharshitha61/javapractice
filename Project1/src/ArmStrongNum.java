
import java.util.Scanner;

public class ArmStrongNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int digit;
        long sum=0;
        long a=s.nextLong();
        long temp=a;
        while(a>0){
            digit= (int) (a%10);
            sum= (long) (sum+Math.pow(digit,3));
            a=a/10;
        }
        if(sum==temp)
            System.out.println("Yes");
        else
            System.out.println("no");
    }
}
