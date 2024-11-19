//left to right

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        insertion_Sort(a);
    }
    public static void insertion_Sort(int a[]){
        int i,j,temp,n=a.length;
        for(i=1;i<n;i++){
            temp=a[i];
            j=i-1;
            while(j>=0 && temp<a[j]){
                a[j+1]=a[j];
            }
            a[j+1]=temp;
            for(int b:a)
                System.out.println(b +" ");
            System.out.println();
        }
    }
}
