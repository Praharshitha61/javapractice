import java.util.Scanner;

public class HotCold {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t,c;
        t=sc.nextInt();
        while(t-- > 0){
            c=sc.nextInt();
            if(c>20)
                System.out.println("HOT");
            else
                System.out.println("COLD");
        }
    }
}
