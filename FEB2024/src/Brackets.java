import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        String str="(())";
        System.out.println(correctBrackets(str));
    }

    private static boolean correctBrackets(String str) {
        Stack<Character> sc=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
                if(sc.size()==0) return false;
                sc.pop();
            }
            else  {
                sc.push('(');
            }
        }
        return sc.size()==0;
    }
}
