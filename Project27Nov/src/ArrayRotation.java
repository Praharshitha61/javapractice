import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//sorted array
public class ArrayRotation {
    public static void main(String[] args) {
        int[] a={30,19,18,2,8,9,12,15,17};
        int pi=5;
        a=arrayRotation(a,pi);
        System.out.println(Arrays.toString(a));


    }
    public static int[] arrayRotation(int[] a,int pi){
        int n=a.length;
        Stack<Integer> s=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        //Queue doesn't have its own constructor
        for(int i=0;i<n;i++){
            if(i<pi)
                q.add(a[i]);
            else
                s.push(a[i]);

        }
        int k=0;
        while(s.size()!=0){
            a[k++]=s.pop();
        }
        while(q.size()!=0){
            a[k++]=q.poll();
            //poll() will return head of queue
        }
        return a;
    }
}

//[17, 15, 12, 9, 30, 19, 18, 2, 8]

