package day10.abs;

public class Main {

    public static void main(String[] args) {

        Dog myDog = new Dog();
        Dog myDog2 = new Dog();
        Dog myDog3 = new Dog();
        Cat myCat = new Cat();
        Cat myCat2 = new Cat();
        Cat myCat3 = new Cat();
        Cat myCat4 = new Cat();
        GoldFish goldFish = new GoldFish();

        Pet[] petList = {myDog, myCat,  myCat2, myCat3, myCat4, myDog2, myDog3, goldFish};

        for (Pet pet : petList) {
            pet.eat();
        }

        myCat.play();
    }
}
