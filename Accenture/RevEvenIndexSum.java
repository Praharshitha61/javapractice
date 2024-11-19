import java.util.Scanner;

public class RevEvenIndexSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),i;
        int[] a=new int[n];
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int res=revEvenIndexSum(a,n);
        System.out.println(res);
    }

    private static int revEvenIndexSum(int[] a, int n) {
        // TODO Auto-generated method stub
        int sum=0;
        if(n%2==0){
            for(int i=n-1;i>=0 && (i%2)!=0;i--){
                sum=sum+a[i];
            }
        }
        else{
            for(int i=n-1;i>=0 && (i%2)==0 ;i--){
                sum=sum+a[i];
            }

        }
        return sum;
    }
}
