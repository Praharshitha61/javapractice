import com.sun.source.tree.Tree;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TtreeSetDescending {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        TreeSet<Integer> s =new TreeSet<Integer>();
        for(int i=0;i<n;i++){
            s.add(sc.nextInt());
        }
//        TreeSet<Integer> r=(TreeSet<Integer>)s.descendingSet();
//        System.out.println(r);


//        for(Integer a:s)
//            System.out.println(a+" ");


        System.out.println(s);
        s.remove(3);
        //tc of remove= logn in treeset
        System.out.println(s);
    }
}
//values in descending order
