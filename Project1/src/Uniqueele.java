import java.util.Scanner;

public class Uniqueele {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,j;
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        boolean flag;
        for(i=0;i<n;i++){
            flag=true;
            for(j=0;j<n;j++){
                if(a[i]==a[j] && i!=j){
                    flag=false;
                    break;
                }
            }
            if(flag)
                System.out.println(a[i]+" ");
        }
    }
}
