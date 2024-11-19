import java.util.Scanner;

public class SquaresSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0,s;
        for(int i=1;i<=n;i++){
                s=i*i;
                sum=sum+s;
        }
        System.out.println(sum);
    }
}

