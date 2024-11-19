import java.util.Scanner;
public class ArmStrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int digit;
        int c=0;
        long sum=0,n;
        n=s.nextLong();
        long t=n;
        while(n>0){
            digit= (int) (n%10);
            c++;
            n=n/10;
        }
        while(n>0){
            digit= (int) (n%10);
            sum=(long) (sum+Math.pow(digit,c));
            n=n/10;
        }
        if(sum==t){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}
