class Col{
    public static void main(String[] args){
        int i,j;
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        //arr[0].length is length of each col
        for(i=0;i<arr.length;i++){
            //arr.length is of each row
            for(j=0;j<arr[0].length;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}