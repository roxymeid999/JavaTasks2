package practice;

public class Dog {

    public String name;
    public String color;
    public int age;

    public void eat(){
    }

    public Dog(){

    }

    public Dog(int age){
        this.age = age;
    }

    public Dog (int age, String name, boolean has){
        
    }

    public Dog(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Dog(String name){
        this.name = name;
    }

    public Dog (String name, int age){
        this(age,name);

    }
}
