import java.util.*;
public class Hhashset {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a;
        Set<Integer> s =new HashSet<Integer>();
        for(int i=0;i<n;i++){
            a=sc.nextInt();
            s.add(a);
        }
        System.out.println(s);
    }
}
//hashset is not sorted,it will store unique elements
//tc= O(n)