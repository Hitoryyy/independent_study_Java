package Inheritance.TwoDShape_1.TwoDShape_4;

// Подкласс для представления треуголников,
// производный от класса TwoDShape
public class Triangle extends TwoDShape {
    private String style;

    // Конструктор
    Triangle(String s, double w, double h) {
        setWidth(w);
        setHeight(h);

        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
