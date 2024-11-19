import java.util.Scanner;

public class FirstSetBitPos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(posOfSetbit(n));
    }

    private static int posOfSetbit(int n) {
        int pos=1;
        if(n%2 != 0)
            //if num is odd then 1st bit is set bit
            return 1;
        else{
            //if num is even then 1st bit is not 1
            while(n%2 == 0){
                n=n>>1;
                pos+=1;
            }
            return pos;
        }
    }
}
//set bit =1
//unset bit=0
//bit position is from right to left