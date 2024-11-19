import java.util.Scanner;

public class NarcissticNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=s.length();
        int a=Integer.parseInt(s);
        long sum=0,temp=a,digit;
        while(a>0){
            digit= (int) (a%10);
            sum= (long) (sum+Math.pow(digit,count));
            a=a/10;
        }
        if(sum==temp)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
//8208