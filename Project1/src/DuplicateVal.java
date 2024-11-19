import java.util.Arrays;
import java.util.Scanner;

public class DuplicateVal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i;
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0],min=a[0];
        for (i=0;i<n;i++){
            if(a[i]>max)
                max=a[i];
            if (a[i]<min)
                min=a[i];
        }
        int range=max-min+1;
        int count[]=new int[range];
        Arrays.fill(count,0);
        for(i=0;i<n;i++){
            count[a[i]-min]++;
        }
        //for(int k: count)
        //System.out.println(k+ " ");
        //i+min=a[i]
        for(i=0;i<range;i++){
            if(count[i]>1){
                System.out.println(i+min);
                break;
            }
        }
    }
}
