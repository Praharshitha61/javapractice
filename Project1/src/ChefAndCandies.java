import java.util.Scanner;

public class ChefAndCandies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t,n,x,d;
        t=sc.nextInt();
        while(t-- > 0){
            n=sc.nextInt();
            x=sc.nextInt();
            if(n>x){
                System.out.println((n-x)/4);
            }
            else if(n<x){
                System.out.println("0");
            }
            else{
                System.out.println();
            }
        }
    }
}
