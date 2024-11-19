

public class SinglyLinkedlistImpl{
    public static void main(String[] args){
        Node start;
        start=createLinkedList();
        printList(start);
        start=reverseLinkedList(start);
        printList(start);
        printSize(start);
        printMedian(start);
    }
    static class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    public static Node createLinkedList(){
        Node start=null;
        Node temp=NULL;
        for(int i=1;i<=11;i++){
            double randomValue=Math.random();
            Node temp_node= new Node(i);
            if(start==NULL){
                start=temp_node;
                temp=start;
            }
            else{
                temp.next=temp_node;
                while(temp.next!=NULL) temp=temp.next;
            }
        }
        return start;
    }
    public static Node reverseLinkedList(Node start){
        Node temp=start;
        Stack<Integer> st=new Stack<>();
        while(temp!=NULL){
            st.push(temp.value);
            temp=temp.next;
        }
        temp=start;
        while(temp!=NULL){
            temp.value=st.pop();
            temp=temp.next;
        }
        return start;
    }
    public static Node printList(Node start){
        if(start==NULL){
            System.out.println("empty list");
        }
        else{
            while(start.next!=NULL){
                System.out.println(start.value +"  ");
                start=start.next;
            }
        }
        System.out.println();
    }
    public static int printSize(Node start){
        int count=0;
        Node temp=start;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void printMedian(Node start){
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
    public static Node sortlist(Node start){
        Node temp=start;
        int index=0;
        int[] a=new int[printSize(start)];
        if(start==NULL){
            System.out.println("empty list");
        }
           while(temp!=null){
              a[index]=temp.value;
              index++;
              temp=temp.next;
           }
           Arrays.sort(a);
           while(temp!=null){
              temp.value=a[index];
              temp=temp.next;
           }
        return start;
    }
}