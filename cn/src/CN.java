import java.util.Scanner;

public class CN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t,n;
        n=sc.nextInt();
        int[] a=new int[n];
        t = sc.nextInt();
        while (t-- > 0) {
            for(int i=0;i<=n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<=n;i++){
                int m=a[i]+a[i+1]+a[i+2];
                if(m%10==0)
                    System.out.println("1");
                else
                    System.out.println("0");
            }
        }
    }
}