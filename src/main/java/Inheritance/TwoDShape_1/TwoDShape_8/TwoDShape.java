package Inheritance.TwoDShape_1.TwoDShape_8;

public class TwoDShape {
    private double width;
    private double height;

    // Конструктор по умолчанию
    TwoDShape() {
        width = height = 0;
    }

    // Параметризированный конструктор
    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    // Создать объект с одинаковыми значениями
    // переменных экземпляра width и height
    TwoDShape(double x) {
        width = height = x;
    }

    // Создать один объект на основе другого
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
    }

    // Методы доступа к переменным экземпляра width и height
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
