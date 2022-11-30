package OOP;

public class Human {

    String name;
    int age;
    int heightInInches;
    String eyeColor;


    public Human() {
    }

    public Human(String name) {
        this.name = name;
        ///System.out.println("Human constructor is called");
    }

    public Human(String name, int age){
        this(name);
        this.age = age;
    }

    public Human(String name, int age, int heightInInches) {
        this(name, age);
        this.heightInInches = heightInInches;
    }

    public Human(String name, int age, int heightInInches, String  eyeColor) {

        this(name, age, heightInInches);
        this.eyeColor = eyeColor;
    }


    public void speak() {
        System.out.println("Hello, my name is " + name);
        System.out.println("My height " + heightInInches);
        System.out.println("I am " + age);
        System.out.println("And my eyecolor is " + eyeColor);
    }


    public void  eat () {
        System.out.println("eating....");
    }

    public void  work () {
        System.out.println("working....");
    }

    public void  walk () {
        System.out.println("walking....");
    }


    public Object metod1() {
        Human o = new Human();
        return o;
    }



    void dummyMethod() {
        System.out.println("I do something on web page");
        System.out.println("I do something on web page");
        System.out.println("I do something on web page");
        System.out.println("I do something on web page");
        System.out.println("I do something on web page!");
        System.out.println("I do something on web page");
        System.out.println("I do something on web page");
        System.out.println("I do something on web page");

    }


    public static void helloStatic(){
        System.out.println("Hi, I am static!");
    }






}