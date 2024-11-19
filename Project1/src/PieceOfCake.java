import java.util.Scanner;

public class PieceOfCake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t-- > 0){
            String s;
            s=sc.next();
            int[] charCount = new int[128];
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                charCount[c]++;
            }
            int maxCount = 0;
            int sum = 0;
            for (int count : charCount) {
                if (count > maxCount) {
                    maxCount = count;
                }
                if (count != 0) {
                    sum += count;
                }
            }
            if (maxCount * (charCount.length - 1) == sum - maxCount) {
                System.out.println("Yes");
            } else System.out.println("No");
        }
    }
}