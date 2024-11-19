import java.util.Scanner;

public class Missingnum {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int i,a,sum=0,d;
        for(i=1;i<100;i++){
            a=sc.nextInt();
            sum=sum+a;
        }
        d= 5050;
        System.out.print(d-sum);
    }
}

/*

 */