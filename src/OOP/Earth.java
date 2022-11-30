package OOP;

public class Earth {

    Human man = new Human();

    public static void main(String[] args) {


        Human human1 = new Human("Grey", 22, 5, "blue");
        //Human human2 = new Human("Grey", 88);
        //Human human3 = new Human("Aziz", 34, 9);



        human1.helloStatic();
        Human.helloStatic();

        human1.speak();

        Man man1 = new Man("Aziz");
        man1.speak();


       // human2.speak();

//
//        System.out.println("****************************************");
//        Woman maria = new Woman("Maria", 10, 5, "green");
//        Man jack = new Man("Jack", 10, 5, "green");
//        maria.speak();
//        jack.speak();
//
//        System.out.println("OOP----------------");
//        //upcasting       parent <===child
//        Human tania = new Woman("Tania");
//        Human jacob = new Man("Jacob");
//
//        //tania and jacob can see only Human variables, methods and Human and overriden methods in
//        //woman/man
//        tania.speak();
//        jacob.speak();
//
//
//        //down casing   child <== parent
//        Man man1 = (Man) new Human();
//
//
//
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
//









    }
}
