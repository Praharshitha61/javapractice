class Random{
    public static void main(String[] args){
        int min=11,max=56;
        double randomValue=(max-min)*Math.random()+min;
        System.out.println((int) floorValue(randomValue));
    }
}