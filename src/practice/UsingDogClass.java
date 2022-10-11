package practice;

public class UsingDogClass {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Katty";
        dog1.color = "black";
        dog1.age = 11;

        dog1.eat();
        System.out.println(dog1.name + dog1.color + dog1.age );

        Dog dog2 = new Dog();
        dog1.name = "Bella";
        dog1.color = "white";
        dog1.age = 5;

        dog1.eat();
        System.out.println(dog1.name + dog1.color + dog1.age );

        System.out.println();

        Dog dog3 = new Dog("Bella", 5);
        System.out.println(dog3.name + dog3.age);
    }



}
