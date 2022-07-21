package Inheritance.TwoDShape_1.TwoDShape_3;

// Использование методов доступа для установки и
// получения значений закрытых членов.

// Класс, описывающий двумерные объекты
public class TwoDShape {
    private double width; // теперь эти переменные
    private double height; // объявлены как закрытые

    // Методы доступа к закрытым переменным экземпляра width и height
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}
