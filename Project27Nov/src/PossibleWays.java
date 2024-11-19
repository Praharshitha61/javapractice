/*public class PossibleWays {
    public static void main(String[] args) {
        int n = 8 ;
       int res =  NumberOfWays(n);
        System.out.println(res+" ");
    }
    private static int NumberOfWays(int n) {
        if(n==1 || n==2){
            return n;
        }
        return NumberOfWays(n-1)+NumberOfWays(n-2);
    }
}*/



//approach 2

public class PossibleWays{
    public static void main(String[] args) {
        int n = 6;
        int[] dp=new int[n+1];
        int res =  NumberOfWays(n,dp);
        System.out.println(res+" ");
    }

    private static int NumberOfWays(int n,int[] dp) {
        if(n==1 || n==2)
            return n;
        if(dp[n]!=0)
            return dp[n];
        int ans1=NumberOfWays(n-1,dp);
        int ans2=NumberOfWays(n-2,dp);
        dp[n-1]=ans1;
        dp[n-2]=ans2;

        return ans1+ans2;
    }
}

