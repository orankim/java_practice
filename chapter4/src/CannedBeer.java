public class CannedBeer {
    public static void main(String[] args){
        buy(20);
        buy(18);   
    }

    public static void buy(int age){
        if(age >= 19){
            System.out.printf("%d세, 캔맥주 구매 가능\n", age);
        }
        else{
            System.out.printf("%d세, 캔맥주 구매 불가\n", age);
        }
    }
    
}
