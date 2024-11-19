import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k,i;
        n=sc.nextInt();
        int a[]=new int[n];
        k=sc.nextInt();
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(i=0;i<n;i++){
            if(a[i]==k)
                System.out.println(i);
        }
        if(a[i]!=k)
            System.out.println("-1");
    }
}



/*
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt(),i,j,a,index=-1;
	    int k=sc.nextInt();

	    for(i=0;i<n;i++)
	    {
	        a=sc.nextInt();
	        if(a==k)
	        {
	            index=i;
	        }
	    }
	    System.out.print(index);
	}
}
 */