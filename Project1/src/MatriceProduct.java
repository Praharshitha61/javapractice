import java.util.Scanner;

public class MatriceProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1, n1,n2,m2, i, j,t;
        t=sc.nextInt();
        while (t-- > 0) {
            n1 = sc.nextInt();
            m1 = sc.nextInt();
            n2 = sc.nextInt();
            m2 = sc.nextInt();
            int[][] a = new int[n1][m1];
            int[][] b = new int[n2][m2];
            int[][] c = new int[n1][m2];
            for (i = 0; i < n1; i++) {
                for (j = 0; j < m1; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            for (i = 0; i < n2; i++) {
                for (j = 0; j < m2; j++) {
                    b[i][j] = sc.nextInt();
                }
            }
            for (i = 0; i < n1; i++) {
                for (j = 0; j < m2; j++) {
                    if(n2==m1)
                    c[i][j] = 0;
                    c[i][j] = c[i][j] +( a[i][j] * b[i][j]);
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
