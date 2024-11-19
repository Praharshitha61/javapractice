import java.util.Scanner;

public class SugarCane {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt(),n;
        int d,e,bs,sm,sr;
        while(t-- > 0){
            n= sc.nextInt();
            d= n * 50;
            bs=1/5*d;
            sm=1/5*d;
            sr=3/10*d;
            e = bs+ sm+ sr;
            System.out.println(e);
        }
    }
}
