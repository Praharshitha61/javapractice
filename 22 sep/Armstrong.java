import java.util.Scanner;

class Armstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int tempnum=n;
        int countOfDigit=0;
        //int digit=(int)Math.log10(n)+1;
        while(tempNum!=0){
            d=d+Math.pow(digit,countOfDigit);
            tempNum=tempNum/10;
        }
        int d=0;
        tempNum=n;
        while(tempNum!=0){
            int digit=tempNum%10;
            d=d+Math.pow(digit,countOfDigit);
            tempnum=tempnum/10;
        }
        if(d==n){
            System.out.println("armstrong ");
        }
        else{
            System.out.println("not arm strong");
        }
    }
}