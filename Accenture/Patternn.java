import java.util.Scanner;

public class Patternn {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<i+1;j++){
                //System.out.print(j+" ");
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
