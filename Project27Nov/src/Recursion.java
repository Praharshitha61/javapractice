/*public class Recursion {
    public static int fun(int n){
        if(n<=2)
            return n;
        return fun(n-1)+fun(n-2);
//        fun(n-2);
//        System.out.println(n);
//        fun(n-1);
    }
    public static void main(String[] args) {
        int n=8;
        int x =fun(n);
        System.out.println(x);
    }
}*/

public class Recursion {
    public static void fun(int n){
        if(n<2)
            return;
        fun(n-2);
        System.out.println(n);
        fun(n-4);
//        fun(n-2);
//        System.out.println(n);
//        fun(n-1);
    }
    public static void main(String[] args) {
        int n=6;
        //2 4 6 2
        fun(n);
    }
}
