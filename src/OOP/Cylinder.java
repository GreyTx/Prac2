package OOP;

public class Cylinder extends Circle{

    double height;

    public Cylinder(){}
    public Cylinder(double radius, double height){
        super(radius);
        if(height > 0)
        this.height = height;
        else
            this.height = 0;
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return getArea()+height;
    }



}
