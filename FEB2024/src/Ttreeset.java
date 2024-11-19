import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ttreeset {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a;
        Set<Integer> s =new TreeSet<Integer>();
        for(int i=0;i<n;i++){
            a=sc.nextInt();
            s.add(a);
        }
        System.out.println(s);
    }
}
//it stores elements in sorted order i.e ascending order