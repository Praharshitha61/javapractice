import java.util.Scanner;

// public class NumPattern {
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         int i,j,n,k;
//         n=s.nextInt();
//         for(i=1;i<=n;i++){
//             for(k=n;k>i;k--){
//                 System.out.print(" ");
//             }
//             for(j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


//    1
//   12
//  123
// 1234


public class NumPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,j,n,k;
        n=s.nextInt();
        for(i=1;i<=n;i++){
            for(k=n;k>i;k--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            for(j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}



//   1
//  121
// 12321



// public class NumPattern {
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         int i,j,n,k;
//         n=s.nextInt();
//         for(i=5;i>=1;i--){
//             for(k=n;k>i;k--){
//                 System.out.print(" ");
//             }
//             for(j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             for(j=i-1;j>=1;j--){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }