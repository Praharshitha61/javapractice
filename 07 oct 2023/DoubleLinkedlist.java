import java.util.Random;

public static DoubleLinkedList{
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int value){
            this.value=value;
            this.prev=null;
            this.next=null;
        }
    }
    public static void main(String[] args){
        Node start=null;
        start=createList(start);
        printList(start);
        int beforeValue=getBeforeValue(7,start);
        int afterValue=getAfterValue(4,start);

    }
    public static int getBefore(int value,Node start){
        int val;
        Node temp=start;
            while(temp!=null){
                if(value==temp.value){
                   val=temp.prev.value;
                    System.out.println(val);
                    temp=temp.next;
                }
                else{
                    temp=temp.next;
                }
            }
            return -1;
        
    }
    public static int getAfter(int value,Node start){
        int val;
        Node temp=start;
        if(temp==null) return -1;
         while(temp!=null){
                if(value==temp.value){
                   val=temp.next.value;
                    System.out.println(val);
                    temp=temp.next;
                }
                else{
                   temp=temp.next;
                }
            }
            return -1;
    }
    public static int getSize(Node start){
        int count=0;
        Node temp=start;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static void getMedian{
        int size=printSize(start),t;
        if(size==0){
            System.out.println("empty list");
        }
        else{
                t=printSize(start)/2;
                for(int i=1;i<t;i++){
                    start=start.next;
                }
                if(size%2==0){
                    System.out.println("median value:  "+(start.value + start.next.value)/2);
                }
                else{
                    System.out.println("median value:  "+ start.next.value);
                }
        }
    }
    public static Node createList(Node start){
        //int max=1000,min=555;
        Node tempNode=null,temp=null;
        for(int i=1;i<=10;i++){
           // Random rand=new Random();
            //int randomValue=rand.nextInt(max-min+1)+min;
            Node tempNode=new Node(i);
            if(start==null){
                start=tempNode;
                temp=start;
            }else{
                temp.next=tempNode;
                temp.next.prev=temp;
                temp=temp.next;
            }
        }

        return start;
    }
    public static Node printList(Node start){
        if(start==null){
            System.out.println("empty list");
        }
        else{
            while(start!=null){
                System.out.println(start.value+" ");
                start=start.next;
            }
        }
        System.out.println();
    }
}