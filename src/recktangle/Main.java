package recktangle;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setSide1(10.0);
        r.setSide2(15.0);

        System.out.println("Area: " + r.areaCalculator());
        System.out.println("Perimeter: " + r.perimeterCalculator());
    }
}
