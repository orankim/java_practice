public class AirConditioner{
    public static void main(String[] args){
        turnOn(30);
        turnOn(19);
    }

    public static void turnOn(int temperature){
        if(temperature > 25){
            System.out.printf("현재 온도 %d도, 에어콘을 가동합니다.", temperature);
        }
    }
}