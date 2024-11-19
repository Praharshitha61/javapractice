import java.util.Scanner;

public class AppleDis {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,k,d;//n=students,k=apples
        n=sc.nextInt();
        k=sc.nextInt();
        d=k%n;
        System.out.println("apples left are:  " +d);
    }
}
