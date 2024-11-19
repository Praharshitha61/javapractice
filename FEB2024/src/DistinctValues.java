import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctValues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        Set<Integer> s=new HashSet<Integer>();
        for(i=0;i<n;i++){
            s.add(sc.nextInt());
        }
        System.out.println(s.size());
    }
}
