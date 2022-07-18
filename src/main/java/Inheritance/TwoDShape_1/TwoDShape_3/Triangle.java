package Inheritance.TwoDShape_1.TwoDShape_3;

// Подкласс для представления треугольников,
// производный от класса TwoDShape
public class Triangle extends TwoDShape{
    String style;

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
