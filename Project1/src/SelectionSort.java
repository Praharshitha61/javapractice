//left to right
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        selection_Sort(a);
    }
    public static void selection_Sort(int a[]){
        int i,j,n=a.length,index;
        for(i=0;i<n-1;i++){
            index=i;
            for(j=i+1;j<n;j++){
                if(a[j]>a[index])
                    index=j;
            }
            if(i!=index)
                swap(a,i,index);
        }
        for(int b:a)
            System.out.println(b +" ");
        System.out.println();
    }
    public static void swap(int a[],int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
}
