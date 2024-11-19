import java.util.Scanner;

public class Sparsematrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, i, j,c=0;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] a = new int[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j]=sc.nextInt();
                if(a[i][j]==0) c++;
            }
        }
        int d=m*n;
        if(c>(d/2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
