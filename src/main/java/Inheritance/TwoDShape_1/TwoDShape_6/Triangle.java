package Inheritance.TwoDShape_1.TwoDShape_6;

// Подкласс для представления треугольников,
// производный от класса TwoDShape
public class Triangle extends TwoDShape {
    private String style;

    // Конструктор по умолчанию
    Triangle() {
        super(); // вызвать конструктор суперкласса по умолчанию
        style = "none";
    }

    // Конструктор
    Triangle(String s, double w, double h) {
        super(w, h); // вызвать конструктор суперкласса с двумя аргументами

        style = s;
    }

    // Конструктор с одним аргументом
    Triangle(double x) {
        super(x); // вызвать конструктор суперкласса с одним аргументом

        style = "закрашенный";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
