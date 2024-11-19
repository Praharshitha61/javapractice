import java.util.Scanner;

public class DuplicateInArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,j;
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        boolean flag=false;
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]);
                    flag=true;
                    break;
                }
            }
            if(flag)
                break;
        }
    }
}
