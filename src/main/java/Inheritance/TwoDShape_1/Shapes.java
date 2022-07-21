package Inheritance.TwoDShape_1;

public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "закрашенный";

        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "контурный";

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());

        System.out.println();

        Rectangle r1 = new Rectangle();

        r1.height = 5.0;
        r1.width = 5.0;
        r1.style = "Штрихованный";

        System.out.println("Информация о r1: ");
        r1.showStyle();
        r1.showDim();
        System.out.println("Площадь - " + r1.area());
    }
}
