public class RandomNumber {
    public static void main(String[] args){
        int n=rollDie();
        System.out.printf("주사위의 눈: %d",n);
    }

    public static int rollDie(){
        double x=6*Math.random();
        int temp=(int) x;
        return temp+1;
    }
    
}
