import java.util.Scanner;

public class DiceSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=s.nextInt(); // sum
        int n=s.nextInt(); // n dice
        System.out.println(diceSum(sum,n));
    }

    private static int diceSum(int sum,int n) {
        // TODO Auto-generated method stub
        int c=0,i;
        for(i=1;i<=n;i++){
            if((sum-i)>=1 && (sum-i)<=n){
                c+=1;
            }
        }
        return c;
    }
}
