import java.util.Scanner;
import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        bubble_Sort(a);
    }
    public static void swap(int a[],int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    public static void bubble_Sort(int a[]){
        int i,j,n=a.length;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(a[j-1]>a[j])
                    swap(a,j-1, j);
            }
            for(int b:a)
                System.out.println(b +" ");
            System.out.println();
        }
    }
}
