import java.util.Scanner;

public class PowerImpl {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b;
        long c=1;
        a=s.nextInt();
        b=s.nextInt();
        for(int i=1;i<=b;i++)  c *= a;
        System.out.println(c);
    }
}


 /*
 static long pow(int a,int b){
 if(b==0)
 return 1;
 else
 return a*pow(a,b-1);
 }
 psvm(){
 int a,b; read a b
 long res=power(a,b);
 sout(res);
 }
  */