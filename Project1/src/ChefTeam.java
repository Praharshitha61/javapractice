import java.util.Scanner;

public class ChefTeam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            int n=sc.nextInt(),i,o=0,e=0;
            for(i=1;i<=n;i++){
                if(n%i==0){
                    if(i%2==0)
                        e++;
                    else
                        o++;
                }
            }
            if(e==0)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
