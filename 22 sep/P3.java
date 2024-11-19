class P3{
    public static void main(String[] args){
        int i,j,n=3;
        //rows
        for(i=1;i<=n;i++){
            //n-i spaces
           for(j=1;j<=(n-i);j++){
               System.out.print(" ");
           }
           //2*i-1 stars in each row
           for(j=1;j<=2*i-1;j++){
               System.out.print("*");
           }
           System.out.println();
        }
    }
}