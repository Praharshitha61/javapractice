import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[32];
        int n=sc.nextInt(),i=0;
        while(n>0){
            a[i]=n%2;
            n=n/2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(a[j]+" ");

        }
    }
}
