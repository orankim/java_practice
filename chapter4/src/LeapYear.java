public class LeapYear {
    public static void main(String[] args){
        leapyear(2020);
        leapyear(1900);
        leapyear(2000);

    }

    public static void leapyear(int n){
        boolean result;
        if(n % 4 == 0 && n % 1000  == 0) result = true;
        else if(n % 4 == 0 && n % 100 ==0) result=false;
        else if(n % 4 == 0) result=true;
        else result=false;

        System.out.printf("%d년은 윤년입니까? %b\n",n, result);

    }
    
}
