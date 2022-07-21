package Inheritance.TwoDShape_1.TwoDShape_10;

public class AbsShape {
    public static void main(String[] args) {
        TwoDShape shapes[] = new TwoDShape[4];
        shapes[0] = new Triangle(8.0, 12.0, "контурный");
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10,4);
        shapes[3] = new Triangle(7.0);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Объект - " + shapes[i].getName());
            System.out.println("Площадь - " + shapes[i].area());
            System.out.println();
        }
    }
}
