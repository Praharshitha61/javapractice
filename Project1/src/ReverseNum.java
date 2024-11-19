import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong(),digit,rev=0;
        while(a!=0){
            digit=a%10;
            rev=rev*10+digit;
            a=a/10;
        }
        System.out.println(rev);
    }
}

