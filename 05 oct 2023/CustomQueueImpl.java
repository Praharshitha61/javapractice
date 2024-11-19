public class CustomQueueImpl{
        public static void main(String[] args){
        int[] q=new int[10];
        int f=9;//(q.len)-1
        int r=9;

        q=pushQueue(q,10,f,r);
        f--;
        printQueue(q,f,r);

        q=popQueue(q,f,r);
        f++;
        printQueue(q,f,r);

        }

        public static int[] pushQueue(int[] q,int val,int f,int r){
            if(f<0){
               System.out.println("overflow");
               return q;
            }
            q[f]=val;
            return q;
        }

        public static int popQueue(int[] q,int f,int r){
            if(f==r){
                System.out.println("underflow");
            }
            for(int i=r;i>=f+1;i--){
                q[i]=q[i-1];
            }
            return q;
        }
//void
        public static int[] printQueue(int[] q,int f,int r){
            for(int i=f+1;i<=r;i++){
                System.out.println(q[i]+" ");
            }
            System.out.println();
        }

        public static int size(int[] q,int f,int r){
            if(f==r)
                return 0;
            return r-f;
        }
}
