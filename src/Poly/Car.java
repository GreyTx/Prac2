package Poly;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;


    public Car(){

    }
    public Car(int cylinders, String name){

       this.cylinders = cylinders;
       this.name = name;
    }


    public String startEngine() {
       return  getName()+" The engine has started";
    }

    public String accelerate () {
        return getName()+" The engine has started";
    }

    public String brake () {
        return getName()+" The engine has started";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
