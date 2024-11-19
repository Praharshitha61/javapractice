import java.util.Scanner;

public class PrimeArr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.println(primeArr(a,n));
    }

    private static boolean primeArr (int[] a, int n) {
        // TODO Auto-generated method stub
        int c1=0;
        for(int j=0;j<n;j++){
            int c=0;
            for(int i=2;i<=Math.sqrt(a[j]);i++){
                if(a[j]%i==0){
                    c++;
                }
            }
            if(c==0){
                c1++;
            }else{
                return false;
            }
           
        }
        if(c1==n){
            return true;
        }
        return false;
    }
}
