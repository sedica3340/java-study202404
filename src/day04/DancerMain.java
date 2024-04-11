package day04;

// 실행용 클래스: 객체를 생성해서 객체의 기능을 실행시키는 곳
// -> main이 필요
public class DancerMain {

    public static void main(String[] args) {

        // 설계도(클래스)를 통해 객체를 찍어냄(생성)
        Dancer kim =  new Dancer();
        kim.dancerName = "김에이스";
        kim.crewName = "치즈";
        kim.genre = "스트릿";
        kim.danceLevel = 1;

        kim.introduce();
        kim.dance();

        Dancer park = new Dancer();
        park.dancerName = "박참치";
        park.crewName = "원양어선";
        park.genre = "코레오";
        park.danceLevel = 2;

        park.dance();

        Dancer hong = new Dancer();
        hong.dance();

        Dancer choi = new Dancer("최스톰");
        choi.dance();
        choi.introduce();

        Dancer nyanyanya = new Dancer("냐냐냐", "고양이");
        nyanyanya.dance();

        Dancer rock = new Dancer("메롱롱", "폭식맨", "락킹");
        rock.introduce();
    }
}
//