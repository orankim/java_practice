public class MoveKeywords {
    public static void main(String[] args){
        /*Item item1 = new Item("마법사의 지팡이", 1000);
        System.out.printf("[%s](%d 골드) 생성완료\n", item1.name, item1.price);

        Item item2 = new Item();
        System.out.printf("[%s](%d 골드) 생성완료\n", item2.name, item2.price);*/

        Weapon w1 = new Weapon("장검", 1200, 10);
        Weapon w2 = new Weapon();
        w1.printInfo();
        w2.printInfo();
    }
}

abstract class Item{
    String name;
    int price;
    Item(String name, int price){
        this.name=name;
        this.price=price;
    }

    Item(){
        this("이름 없음", -1);
    }
}

class Weapon extends Item{
    int power;
    Weapon(String name, int price, int power){
        super(name, price);
        this.power = power;
    }
    Weapon(){
        super();
        this.power = -1;
    }
    void printInfo(){
        System.out.printf("[%s] 가격: %d 골드, 공격력: %d\n", super.name, super.price, this.power);
    }
}