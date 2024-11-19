// public class GreaterValInArray {
//    public static void main(String[] args) {
//        int[] a={3,1,3,5,2,1,2,2};
//        int[] ans=arrrrayy(a);
//        System.out.println(ans);
//    }
//    public  static int[] arrrrayy(int[] a){
//        int temp;
//        for(int i=1;i<a.length;i++){
//            if(a[i-1]>a[i]){
//                temp=a[i];

//            }
//        }
//        return a;
//    }
// }






import java.util.Scanner;

public class MaxElementArray {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a= new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
        s.close();
    }
}
