import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        merge_sort(a,0,n-1);
        for(int b:a)
            System.out.println(b +" ");
        System.out.println();
    }
    public static void merge(int a[],int l,int m,int r){
        int i=l,j=m+1,k=0;
        int temp[]=new int[r-l+1];
        while(i<=m && j<=r){
            if(a[i]<a[j]){
                temp[k++]=a[i++];
            }
            else
            {
                temp[k++]=a[j++];
            }
        }
        while(i<=m){
            temp[k++]=a[i++];
        }
        while(j<=r){
            temp[k++]=a[j++];
        }
        for(int b=l;b<=r;b++){
            a[b]=temp[b-l];
        }
    }
    public static void merge_sort(int a[],int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            merge_sort(a,left,mid);
            merge_sort(a,mid+1,right);
            merge(a,left,mid,right);
            for(int i=left;i<=right;i++){
                System.out.println();
            }
        }
        for(int b:a)
            System.out.print(b +" ");
        System.out.println();
    }
}