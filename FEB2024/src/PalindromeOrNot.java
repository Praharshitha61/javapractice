import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(getPalindromeOrNotWithRecursion(s));
    }
    private static boolean getPalindromeOrNotWithRecursion(String s) {
        int n=s.length();
        if(s.length()==0 || s.length()==1)
            return true;
        if(s.charAt(0)!= s.charAt(n-1))
            return false;
        String subStr=s.substring(1,n-1);
        return getPalindromeOrNotWithRecursion(subStr);
    }
}
