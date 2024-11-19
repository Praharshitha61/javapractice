import java.util.Scanner;

public class StackOp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] stk=new int[10];
        int f=0,r=0;
        stk=push(stk,value:10,f,r);
        f++;
        r=f-1;
        printStack(stk,r);

        stk=pop(stk,f,r);
        if(f!=0){
            r--;
            f--;
        }

        System.out.println("topmost element is: " , peek(stk,f,r));
    }
    //push
    public static int[] push(int[] stack,int value,int f,int r){
        if(f>stack.length-1){
            System.out.println("overflow");
            return stack;
        }
        stack[f]=value;
        return stack;
    }
    //print stack
    public static void printStack(int[] st,int r){
        for(int i=0;i<=r;i++){
            System.out.println(st[i]+" ");
        }
        System.out.println();
    }
    //pop
    public static int[] pop(int[] stack,int f,int r){
        if(f==0){
            System.out.println("underflow");
        }
        system.out.println(stack[r]+" ");
        return stack;
    }

    public static int peek(int[] stack,int f,int r){
        if(f==0 && r==0)
            System.out.println(" empty");
        System.out.println(stack[r]);
    }

    public static int size(int[] st,int f,int r){
        if(f==0)
            return 0;
        return r+1;
    }
}