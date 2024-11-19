public class BinarySerach {
    public static void main(String[] args) {
        int[] a={0,1,2,3,4,5,6,7,8};
        int search=8;
        int i=0,j=a.length-1,mid;
        boolean result=binarySearch(a,search,i,j);
        System.out.println(result);
    }
    public static boolean binarySearch(int[] a,int search,int i,int j){
        while(i<=j){
            if(i==j)
                return a[i]==search;
            int mid=(i+j)/2;
            if(a[mid]==search)
                return true;
            if(a[mid]<search)
                i=mid+1;
            if(a[mid]>search)
                j=mid-1;
        }
        return false;
    }
}
