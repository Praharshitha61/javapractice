import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        String str=sc.next();
        str= str.toLowerCase();
        Set<Character> s=new HashSet<Character>();
        for(int i=0;i<len;i++){
            s.add(str.charAt(i));
        }
        if(s.size()==26)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
