public class PalindromeOrNot {
    public static void main(String[] args) {
        String s="mom";
        String s1="mummy";
        boolean result= getPalindromeOrNotWithoutRecursion(s);
        boolean result2=getPalindromeOrNotWithRecursion(s1);
        System.out.println(result);
        System.out.println(result2);
    }

    private static boolean getPalindromeOrNotWithRecursion(String s) {
        int n=s.length();
        if(s.length()==0 || s.length()==1)
            return true;
        if(s.charAt(0)!= s.charAt(n-1))
            return false;
        String subStr=s.substring(1,n-1);
        return getPalindromeOrNotWithRecursion(subStr);
    }

    private static boolean getPalindromeOrNotWithoutRecursion(String s) {
       /*
        //two pointer approach
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
        */

        int i;
        String str="";
        for(i=s.length()-1;i>=0;i--){
            str+=s.charAt(i);
        }
        if(str.equals(s))
            return true;

        return false;
    }
}
