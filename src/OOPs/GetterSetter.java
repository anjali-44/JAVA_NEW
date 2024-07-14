package OOPs;

class Cylinder {
    private int height;
    private int radius;

    Cylinder() {
    }

    Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }

    public double volume() {
        return Math.PI*radius*radius*height;
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        System.out.println("Using getters and setters : ");

        Cylinder myCylinder = new Cylinder();
        myCylinder.setRadius(12);
        myCylinder.setHeight(12);

        System.out.println("Radius is : " + myCylinder.getRadius());
        System.out.println("Height is : " + myCylinder.getHeight());
        System.out.println("SA is : " + myCylinder.surfaceArea());
        System.out.println("Volume is : "  +myCylinder.volume());

        System.out.println("Using constructor : ");

        Cylinder myCylinder1 = new Cylinder();
        myCylinder1.setHeight(12);
        myCylinder1.setRadius(15);

        System.out.println("Radius is : " + myCylinder1.getRadius());
        System.out.println("Height is : " + myCylinder1.getHeight());
//
        System.out.println("SA : " + myCylinder1.surfaceArea());
        System.out.println("Volume : " + myCylinder1.volume());


        System.out.println("Using parameterized constructor : ");

        Cylinder myCylinder2 = new Cylinder(10,5);
//        myCylinder2.Cylinder(10, 5);

        System.out.println("Radius is : " + myCylinder2.getRadius());
        System.out.println("Height is : " + myCylinder2.getHeight());

        System.out.println("SA : " + myCylinder2.surfaceArea());
        System.out.println("Volume : " + myCylinder2.volume());

    }
}