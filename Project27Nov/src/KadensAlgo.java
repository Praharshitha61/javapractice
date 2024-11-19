public class KadensAlgo {
    public static void main(String[] args) {
        int[] a={-2,3,4,-6,98,-45,54,-67};
//      int[] a={-3,8,-13,5,7,-9,-2,14,-8,6,1};
        int n=a.length;
        System.out.println(getMaxSubArraySum(a,n));
    }
    public static int getMaxSubArraySum(int[] a,int n){
        int currentsum=0,i;
        int maxsum=Integer.MIN_VALUE;
        for(i = 0; i< n ; i++) {
            if(currentsum<0)
                currentsum=0;
            if(a[i]>=0)
                currentsum+=a[i];
            if(a[i]<0){
                maxsum=Math.max(maxsum,currentsum);
                currentsum+=a[i];
            }
        }
        return Math.max(maxsum,currentsum);
    }
}
//it is used to to print maxsum of subarray