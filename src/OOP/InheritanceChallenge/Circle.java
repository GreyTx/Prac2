package OOP.InheritanceChallenge;

public class Circle {


    double radius;

    Circle() {

    }

    Circle(double radius) {
        if (radius > 0)
        this.radius = radius;
        else
        this.radius = 0;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (radius * radius * Math.PI);
    }

}
