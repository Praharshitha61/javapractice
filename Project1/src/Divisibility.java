import java.util.Scanner;

//AM divisible by 2,4 8
public class Divisibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=0,t=3,i;
        if(str.length()<=3)
            n=Integer.parseInt(str);
        else{
            i=str.length()-3;
            while(t-- > 0){
                n=n*10+(str.charAt(i)-48);
                i++;
            }
        }
        //System.out.println(n);
        if(n%2==0) 
            System.out.println("Yes");
        else
            System.out.println("No");
        if(n%4==0)
            System.out.println("Yes");
        else
            System.out.println("No");
        if(n%8==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
