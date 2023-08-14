public class Pork {
    public static void main(String[] args){
        int n=3;
        double c=calorie(n);

        System.out.printf("삼겹살 %d인분의 칼로리: %.2f kcal",n,c);
    }

    public static double calorie(int n){
        int weight=n*180;
        return weight*5.179;

    }
    
}
