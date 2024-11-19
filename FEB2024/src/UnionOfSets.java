import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfSets {
    public static void main(String[] args){
        Integer a[]={1,2,3,4};
        Integer b[]={3,4,5,6};

        Set<Integer> s1 =new TreeSet<>(Arrays.asList(a));
        Set<Integer> s2 =new TreeSet<>(Arrays.asList(b));
        s1.addAll(s2);    //union
        //s1.retainAll(s2);   //intersection with s2
        //s1.removeAll(s2);
        //s1.clear();  //clears all elements
        System.out.println(s1.isEmpty());   //if empty true else false
        System.out.println(s1);
        System.out.println(s1.size());   //no.of elements of set
        //System.out.println(s1.contains(3));   //if present true else false
        //System.out.println(s1.containsAll(s2));
    }
}
