package OOP;

public class Man extends Human {

    String job;
    String favoriteGym;

    public Man(){}

    public Man(String name) {
        super(name);
    }

    public Man(String name, int age) {
        super(name, age);
    }
    public Man(String name, int age, int height) {
        super(name, age, height);
    }

    public Man(String name, int age, int height, String eyeColor) {
        super(name, age, height, eyeColor);
    }


    @Override
    public void speak() {
        System.out.println("I am a man and I'm speaking");
        System.out.println("My name is " + name);

//
//        System.out.println("**************");
//        Circle circle = new Circle(3.75);
//        System.out.println("circle.radius= " + circle.getRadius());
//        System.out.println("circle.area= " + circle.getArea());
//        Cylinder cylinder = new Cylinder(5.55, 7.25);
//        System.out.println("cylinder.radius= " + cylinder.getRadius());
//        System.out.println("cylinder.height= " + cylinder.getHeight());
//        System.out.println("cylinder.area= " + cylinder.getArea());
//        System.out.println("cylinder.volume= " + cylinder.getVolume());


    }

    @Override
    public Object metod1() {
        Object a = new Object();
        return a;
    }
}
