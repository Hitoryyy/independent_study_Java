package Inheritance.TwoDShape_1.TwoDShape_7;

// Расширение класса TwoDShape
public class Triangle extends TwoDShape{
    private String style;

    // Конструктор по умолчанию
    Triangle() {
        super();
        style = "none";
    }

    Triangle(String s, double w, double h){
        super(w, h); // вызвать конструктор суперкласса

        style = s;
    }

    // Конструктор с одним аргументом для построения треугольника
    Triangle(double x) {
        super(x); // вызвать конструктор суперкласса

        style = "закрашенный";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("треугольник " + style);
    }
}
