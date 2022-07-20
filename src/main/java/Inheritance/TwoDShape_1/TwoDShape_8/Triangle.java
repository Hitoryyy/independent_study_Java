package Inheritance.TwoDShape_1.TwoDShape_8;

// Подкласс для представления треугольников,
// производный от класса TwoDShape
public class Triangle extends TwoDShape{
    private String style;

    // Конструктор по умолчанию
    Triangle() {
        super();
        style = "none";
    }

    // Конструктор класса Triangle
    Triangle(String s, double w, double h) {
        super(w, h); // вызвать конструтор суперкласса

        style = s;
    }

    // Конструктор с одним аргументом для построения треугольника
    Triangle(double x) {
        super(x);

        style = "закрашенный";
    }

    // Создать один объект на основе другого
    Triangle(Triangle ob) {
        super(ob); // передача объекта конструктору класса TwoDShape
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
