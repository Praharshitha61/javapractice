import java.util.Scanner;
public class DiagonalSum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int m, n, i, j, t;
            t = sc.nextInt();
            while (t-- > 0) {
                m = sc.nextInt();
                n = sc.nextInt();
                int a[][] = new int[m][n];
                for (i = 0; i < m; i++) {
                    for (j = 0; j < n; j++) {
                        a[i][j] = sc.nextInt();
                    }
                }
                i = 0;
                while (i < m) {
                    int sum = 0;
                    j = 0;
                    while (j < n) {
                        sum = sum + a[i][j];
                        j++;
                    }
                    System.out.println(sum);
                    i++;
                }
            }
        }
}
