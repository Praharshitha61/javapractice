//WAP for fibonaci series of n
import java.util.Scanner;

class Fibonaci{
    public static void main(String[] args){
        int n,a=0,b=1,i=0,c,temp;
        Scanner sc=new Scanner(System.in);
        int n=nextInt();
        System.out.println(a+" "+b);
        while(i<n-1){
            c=a+b;
            System.out.println(c);
            temp=a;
            a=b;
            b=c;
        }
        sc.close();
    }
}
/*
if(n==1){System.out.println(i:0);}
if(n==2){System.out.println(0+""+1);}
if(n>2){
    System.out.println(0+""+1+"");
    for(int i=2;i<n;i++){
        int next=a+b;
        System.out.println(next+" ");
        a=b;
        b=next;
    }
}
*/