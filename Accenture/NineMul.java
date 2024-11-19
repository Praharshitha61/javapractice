import java.util.Scanner;

public class NineMul {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n%9==0){
            System.out.println(9);
        }
        else{
            System.out.println(n%9);
        }
    }
}
