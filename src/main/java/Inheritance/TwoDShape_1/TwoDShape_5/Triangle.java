package Inheritance.TwoDShape_1.TwoDShape_5;

// Подкласс для представления треугольников,
// производный от класса TwoDShape
public class Triangle extends TwoDShape {
    private String style;

    Triangle(String s, double w, double h) {
        super(w, h); // вызвать конструктор суперкласса

        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle () {
        System.out.println("Треугольник " + style);
    }
}
