import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt(),c=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        // for(int i=2;i<=Math.sqrt(n);i++){
        //     if(n%i==0){
        //         c++;
        //     }
        // }
        // if(c==0){System.out.println("yes");}

        if(c==1){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
