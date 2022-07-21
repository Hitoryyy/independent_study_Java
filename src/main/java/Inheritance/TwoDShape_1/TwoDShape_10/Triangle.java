package Inheritance.TwoDShape_1.TwoDShape_10;

//  Подкласс для представления треугольников,
//  производный от класса TwoDShape
public class Triangle extends TwoDShape {
    private String style;

    //  Конструктор по умолчанию
    Triangle() {
        super();
        style = "none";
    }

    //  Конструктор класса Triangle
    Triangle(double w, double h, String s) {
        super(w, h, "Треугольник");

        style = s;
    }

    //  Конструктор с одним элементом для построения треугольника
    Triangle(double x){
        super(x, "Треугольник");
        style = "закрашенный";
    }

    // Создать один объект на основе другого
    Triangle(Triangle ob) {
        super(ob); //   передать объект конструктору класса TwoDShape
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольниу " + style);
    }
}
