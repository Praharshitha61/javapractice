class Char{
    public static void main(String[] args){
        int i,j,n=3;
        char ch='a';
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}