package BTVN;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red");
        System.out.println(circle);
        System.out.println("Area of Circle: " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.0, "Blue", 10.0);
        System.out.println(cylinder);
        System.out.println("Volume of Cylinder: " + cylinder.getVolume());
    }
}
