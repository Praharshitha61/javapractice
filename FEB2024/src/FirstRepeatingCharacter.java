import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstRepeatingCharacter {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            String str=sc.next();
            char ch='.';
            Map<Character,Integer> mp=new HashMap<Character,Integer>();
            for(int i=0;i<str.length();i++){
                mp.put(str.charAt(i),mp.getOrDefault(str.charAt(i),0)+1);
            }
            boolean flag=true;
            for(int i=0;i<str.length();i++){
                if(mp.get(str.charAt(i))>1){
                    ch=str.charAt(i);

                    break;
                }
            }
            System.out.println(ch);
            t--;
        }
    }
}
