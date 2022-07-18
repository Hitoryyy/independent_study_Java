package Inheritance.TwoDShape_1;

// Подкласс для представления треугольников,
// производный от класса TwoDShape
public class Triangle extends TwoDShape{
    String style;

    double area() {
        return width * height / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
