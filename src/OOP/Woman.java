package OOP;

public class Woman extends Human {

    String car;
    String favoriteCloth;

    public Woman(){}

    @Override
    public void speak() {
        System.out.println("I'm a woman and I'm speak speaking");
        System.out.println("My name is " + name);
    }

    public void speak2(){
        System.out.println("Hooray!");
    }

    public Woman(String name) {
        super(name);
        System.out.println("Woman constructor is called");
    }

    public Woman(String name, int age) {
        super(name, age);
    }
    public Woman(String name, int age, int height) {
        super(name, age, height);
    }

    public Woman(String name, int age, int height, String eyeColor) {
        super(name, age, height, eyeColor);
    }

}
