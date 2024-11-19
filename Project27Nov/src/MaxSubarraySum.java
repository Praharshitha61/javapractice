public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] a={-3,8,-2,-7,-6,16,8,4,16};
        int k=3;
        System.out.println(maxSubArrSum(a,k));
    }
    public static int maxSubArrSum(int[] a,int k) {
        int res = Integer.MIN_VALUE;
        int previoussum = res;
        int i = 0, j = k - 1;
        int maxSum = 0;
        while (j < a.length) {
            int currentsum = 0;
            if (i == 0) {
                for (int z = i; z <= j; z++)
                    currentsum += a[z];
            } else {
                currentsum = previoussum - a[i - 1] + a[j];
            }
            res = Math.max(res, currentsum);
            previoussum = currentsum;
            i++;
            j++;
        }
        return res;

    }
}
