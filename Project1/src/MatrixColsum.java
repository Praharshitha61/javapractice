import java.util.Scanner;

public class MatrixColsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, i, j;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] a = new int[m][n];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (j = 0; j < n; j++) {
            int sum = 0;
            for (i = 0; i < m; i++) {
                sum += a[i][j];
            }
            System.out.println(sum);
        }
    }
}
