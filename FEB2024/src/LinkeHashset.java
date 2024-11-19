import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LinkeHashset {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a;
        Set<Integer> s =new LinkedHashSet<Integer>();
        for(int i=0;i<n;i++){
            a=sc.nextInt();
            s.add(a);
        }
        System.out.println(s);
    }
}
//linked hashset preserves insertion order
//time complexity=O(logn)