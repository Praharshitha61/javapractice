class Arr{
    public static void main(String[] args){
        int i,j;
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        //arr[0].length is length of each row
        for(i=0;i<arr[0].length;i++){
            //arr.length is of each col
            for(j=0;j<arr.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}