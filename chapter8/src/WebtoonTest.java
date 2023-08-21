public class WebtoonTest {
    public static void main(String[] args){
        Webtoon levelUpUp= new Webtoon("나 혼자만 레벨업업", "판타지", "추공님");
        Webtoon sweetHouse= new Webtoon("스위트 집", "스릴러", "칸비님");
        Webtoon itaewonClassic= new Webtoon("이태원 클래식", "드라마", "광진님");

        Webtoon[] webtoons = {levelUpUp, sweetHouse, itaewonClassic};
        for(int i=0;i<webtoons.length;i++) System.out.println(webtoons[i].toStr());
        System.out.printf("웹툰 객체의 총 수: %d", Webtoon.getCount());

    }
}

class Webtoon{
    private String title;
    private String genre;
    private String author;
    private static int count =0;

    public Webtoon(String t, String g, String a){
        title = t;
        genre = g;
        author = a;
        Webtoon.count++;
    }

    public String toStr(){
        return String.format("Webtoon { title: %s, genre: %s, author: %s}", title, genre, author);
    }

    public static int getCount(){
        return Webtoon.count;
    }
}