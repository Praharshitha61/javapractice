import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,i;
        n = s.nextInt();
        for(i=0;i<=n;i++){
            if(i%2==0)
                System.out.print(i+" ");
        }
    }
}
