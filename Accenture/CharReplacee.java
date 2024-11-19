import java.util.Scanner;

public class CharReplacee {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String res=" ";
        char ch1=s.next().charAt(0);
        char ch2=s.next().charAt(0);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== ch1){
                str.replace(ch2,str.charAt(i));
            }
            else if(str.charAt(i)==ch2){
                str.replace(ch1,str.charAt(i));
            }
            else{
                res+=str.charAt(i);
            }
        }
        System.out.println(str);
    }
}
