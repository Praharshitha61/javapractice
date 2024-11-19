class P4{
    public static void main(String[] args){
        int i,j,n=3;
        //rows
        for(i=1;i<=n;i++){
            //n-i spaces
           for(j=1;j<=(n-i);j++){
               System.out.print(" ");
           }
           boolean flag = true;
           //2*i-1 stars in each row
           for(j=1;j<=2*i-1;j++){
               if(flag){
                  System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
               flag = !flag;
           }
           System.out.println();
        }
    }
}