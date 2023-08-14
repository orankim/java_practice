public class OddorEven {
    public static void main(String[] args){
        printResult(13);
        printResult(6);
    }

    public static void printResult(int n){
        String result = (n % 2 == 1) ? "홀수" : "짝수" ;
        System.out.printf("정수 %d은 %s입니다.\n", n, result);
    }
    
}
