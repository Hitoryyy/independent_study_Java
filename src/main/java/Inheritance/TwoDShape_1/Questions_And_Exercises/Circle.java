package Inheritance.TwoDShape_1.Questions_And_Exercises;

//  Подкласс, производный от класса TwoDShapes, для
public class Circle extends TwoDShapes {
    String style;

    //  Конструктор по умолчанию
    Circle() {
        super();
    }

    //  Конструктор класса Circle
    Circle(double x) {
        super(x, "окружность"); //  вызвать конструктор суперкласса
    }

    Circle(Circle ob) {
        super(ob); //   передать объект конструктору класса TwoDShape
    }

    double area() {
        return (getWidth() / 2) * (getHeight() / 2) * 3.1416;
    }

    void showStyle() {
        System.out.println("Фигура - " + style);
    }
}
