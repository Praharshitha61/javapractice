public class MergeSortedArrays {
    public static void main(String[] args){
        int[] arr1={-2,-1,23,45,47,56,76};
        int[] arr2={-9,0,3,4,23,24,35,46,67};
        int[] ans=mergeSortedArrays(arr1,arr2);

        for(int e: ans)
            System.out.println(e+" ");
    }

    private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] arr=new int[arr1.length + arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length) {
            if (arr1[i] > arr2[j]) {
                arr[k] = arr2[j];
                j++;
            }
            else {
                arr[k] = arr1[i];
                i++;
            }
            k++;
        }
        while(j<arr2.length){
            arr[k]=arr2[j];
            k++;
            j++;
        }
        while(i<arr1.length) {
            arr[k] = arr1[i];
            k++;
            i++;
        }
        return arr;
    }

}
