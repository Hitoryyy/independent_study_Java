package Inheritance.TwoDShape_1;

// Подкласс для представления прямоугольников,
// производный от класса TwoDShape
public class Rectangle extends TwoDShape {

    String style;

    boolean isSquare() {
        if (width == height) return true;
        return false;
    }

    double area() {
        return width * height;
    }

    void showStyle() {
        System.out.println("Прямоуглоник " + style);
    }
}
