//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Set;
//
//public class ForwardBackward {
//    public static void main(String[] args) {
//        String str="FBFFBBFF";
//        System.out.println(getUniquePositionCount(str));
//
//    }
//    public static <Iterator> int getUniquePositionCount(String str){
//        Set<Integer> mySet=new HashSet<>();
//        //Set doesn't have its own constructor
//        mySet.add(0);
//        int fc=2,bc=2;
//        int cpos=0;
//        for (int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if(ch=='F'){
//                cpos+=fc;
//                if(fc == 2)
//                    fc=1;
//                else
//                    fc=2;
//            }
//            else{
//                if(cpos - bc >=0){
//                    cpos = cpos-bc;
//                    if(bc == 2) bc=1;
//                    else bc = 2;
//                }
//            }
//            mySet.add(cpos);
//        }
//
//        Iterator<Integer> i=new Iterator<>();
//        while(i.hasNext()){
//            System.out.println(i.next()+" ");
//        }
//        System.out.println();
//        return mySet.size();
//
//    }
//}
