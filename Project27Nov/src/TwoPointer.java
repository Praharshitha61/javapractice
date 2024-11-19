/*
//time complexity is high(n*n)

public class TwoPointer {
    public static void main(String args[]){
        int[] arr={-3,8,-9,18,6,12,-5,4,7};
        int target=98;

        boolean result=doesPairExist(arr,target);
        System.out.println(result);
    }
    public static boolean doesPairExist(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
*/


//
//import java.util.Arrays;
//
//public class TwoPointer {
//    public static void main(String args[]){
//        int[] arr={-3,8,-9,18,6,12,-5,4,7};
//        int target=20;
//
//        boolean result=twoPointerApproach(arr,target);
//        System.out.println(result);
//    }
//    public static boolean twoPointerApproach(int[] arr, int target){
//      //time complexity is n+nlogn
//        Arrays.sort(arr);
//        int i=0,j=arr.length -1;
//        while(i<j){
//            if(arr[i]+arr[j]==target)
//                return true;
//            if(arr[i]+arr[j]<target)
//                i++;
//            if(arr[i]+arr[j]>target)
//                j--;
//        }
//        return false;
//    }
//}


import java.util.HashMap;
import java.util.HashMap;

//usingHashmap
public class TwoPointer {
    public static void main(String[] args) {
        int[] a={3,-1,2,7,9,-5,4,12,-5,9};
        int target=18;
        System.out.println(isPairExist(a,target));
    }

    private static boolean isPairExist(int[] a,int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int e : a){
            // if(map.containsKey(e)){
            //     int value = map.get(e);
            //     value+=1;
            //     map.put(e,value);
            // }else{
            //     map.put(e,1);
            // }
            map.put(e,map.getOrDefault(e, 0)+1);
        }

        for(int e : a){
            int remTarget = target-e;
            if(map.containsKey(remTarget)){
                if(remTarget == e && map.get(remTarget)>1){
                    return true;
                }
                if(remTarget != e) return true;
            }
        }
        return false;
    }
}
//key      3  -1  2  7  9  -5  4  12
//value    1   1  1  1  2   2  1  1

//constant time operation in map to set a value