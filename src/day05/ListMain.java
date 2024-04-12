package day05;

public class ListMain {

    public static void main(String[] args) {

        StringList foods = new StringList();
        StringList userNames = new StringList();

        System.out.println(foods.size());
        foods.push("잠봉뵈르");
        foods.push("첵스초코");
        userNames.push("박성진");
//        foods.remove(0);
//        foods.remove("첵스초코");
        userNames.push("김철수");
        userNames.push("홍길동");
        userNames.insert(1,"뽀로로");
        foods.insert(1,"마라탕");

        foods.set(0, "김치볶음밥");
        userNames.set(1, "대길이");
        foods.clear();
        boolean flag = foods.isEmpty();

        System.out.println("flag = " + flag);
        System.out.println("foods = " + foods.toString());
        System.out.println("userNames = " + userNames.toString());


        StringList hobbies = new StringList("축구", "영화감상", "음악감상");

        hobbies.push("멍때리기");
        System.out.println("hobbies = " + hobbies.toString());

        StringList games = new StringList("lol", "spelunky");
        System.out.println("games = " + games.toString());
    }
}
