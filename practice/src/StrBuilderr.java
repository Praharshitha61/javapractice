import java.util.Scanner;

public class StrBuilderr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//        StringBuilder sb=new StringBuilder(s.nextLine());
//        //System.out.println(sb.charAt(2));
//        System.out.println(sb);
        int n=s.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=n;j>=1;j--){
                if(j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
