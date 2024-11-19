import java.util.Scanner;
public class PajaChef {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t= sc.nextInt();
            while(t-- > 0) {
                int n= sc.nextInt();

                StringBuilder binaryString = new StringBuilder("1");
                for (int i = 1; i < n - 1; i++) {
                    binaryString.append("0");
                }
                binaryString.append("1");


                System.out.println(binaryString.toString());
            }

            sc.close();
        }

}
