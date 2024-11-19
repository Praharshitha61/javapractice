class Rstars{
    public static void main(String[] args){
        int i,j,n=3;
        //rows
        for(i=0;i<n;i++){
            //spaces
            for(j=1;j<=i;j++){
                System.out.print(" ");
            }
            //stars
            for(j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}