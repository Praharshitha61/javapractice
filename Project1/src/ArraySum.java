import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t,n;
        long sum;
        t=sc.nextInt();
        while(t-- > 0){
            sum=0;
            n=sc.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
                sum=sum+a[i];
            }
            System.out.print(sum);
        }
    }
}
