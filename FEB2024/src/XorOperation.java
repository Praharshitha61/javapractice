import java.sql.SQLOutput;

public class XorOperation {
    public static void main(String[] args) {
        int[] a={2,1,1,2};
        System.out.println(xorOp(a));
    }
    private static int xorOp(int[] a) {
        int sum=0;
        for(int i=0;i<a.length;i++){
                sum=sum^a[i];
        }
        return sum;
    }
}
