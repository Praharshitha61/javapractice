import java.util.Scanner;

public class NoOfHandShakes {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt(),res=0,n;
        while(t-- > 0){
            n=s.nextInt();
            res=n*(n-1)/2;
            System.out.println(res);
        }
        
    }
}
