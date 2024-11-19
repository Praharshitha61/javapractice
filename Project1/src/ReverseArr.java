import java.util.Scanner;

public class ReverseArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i;
        long temp=0;
        long a[]=new long[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextLong() ;
        }
        for(i=0;i<n/2;i++){
            temp=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=temp;
        }
        for(i=0;i<n;i++){
            System.out.println(a[i]+ " ");
        }
    }
}
