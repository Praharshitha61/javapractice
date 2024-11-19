public class TowerOfHanoi {
    public static void main(String[] args) {
        char source='A',destination='C',auxillary='B';
        int n=3;
        towerOfHanoi(source,destination,auxillary,n);
    }

    private static void towerOfHanoi(char source, char destination, char auxillary, int n) {
        if(n<=0)
            return ;
        towerOfHanoi(source,auxillary,destination,n-1);
        System.out.println(source+"-->"+destination);
        towerOfHanoi(auxillary,destination,source,n-1);
    }
}
