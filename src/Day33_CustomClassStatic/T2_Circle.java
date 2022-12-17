package Day33_CustomClassStatic;

public class T2_Circle {
    public double radius;
    public double diameter;

    public static double pi=3.14;

    public T2_Circle(double radius) {
        this.radius = radius;
        this.diameter=radius*2;
    }

    public double areaCircle(){
        double area=(radius*radius)*pi;
        return area;
    }
    public double perimeter(){
        double perimeter=diameter*pi;
        return  perimeter;
    }

    @Override
    public String toString() {
        return "T2_Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", areaCircle=" + areaCircle() +
                ", circlePerimeter=" + perimeter() +
                '}';
    }
}
