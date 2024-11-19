import java.util.Scanner;

public class PriyaAnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t-- > 0){
            int n,i,j,c=0;
            n=sc.nextInt();
            int[] a=new int[n];
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
            for(i=0;i<n;i++){
                for(j=0;j<n;j++){
                    if(i<j){
                        if((a[i]&a[j])==a[i]){
                                c++;
                        }
                    }
                }
            }
            System.out.println(c);
        }
    }
}
