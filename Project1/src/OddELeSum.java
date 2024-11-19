import java.util.Scanner;

public class OddELeSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,a;
        long sum=0;
        for(i=0;i<n;i++){
            a=sc.nextInt();
            if(a%2==0)
                sum+=a;
        }
        System.out.println(sum);
    }
}
