public class TowerOfHanoi {
    public static void main(String[] args) {
        int n=3;
        char src='A',aux='B',des='C';
        toh(n,src,aux,des);
    }

    private static void toh(int n, char src, char aux, char des) {
        if(n==1){
            System.out.println(src+"->"+des);
            return ;
        }
        toh(n-1,src,des,aux);
        System.out.println(src+"->"+des);
        toh(n-1,des,aux,src);
    }
}




//A->C
//A->B
//B->A
//A->C
//C->B
//C->A
//A->C
