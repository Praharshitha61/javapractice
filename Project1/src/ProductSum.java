import java.util.Scanner;

public class ProductSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t,n;
        long p;
        t=sc.nextInt();
        while(t-- > 0){
            p=1;
            n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                p=p*a[i];
            }
            System.out.print(p);
        }
    }
}
