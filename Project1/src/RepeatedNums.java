import java.util.Scanner;

public class RepeatedNums {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt(), n, i, a;
            while (t-- > 0) {
                n = sc.nextInt();
                int count[] = new int[n];
                for (i = 0; i < n; i++) {
                    a = sc.nextInt();
                    count[a]++;
                }
                for (i = 0; i < n; i++) {
                    if (count[i] == 2) {
                        System.out.print(i + "");
                    }
                }
                System.out.println();
            }
        }
}
