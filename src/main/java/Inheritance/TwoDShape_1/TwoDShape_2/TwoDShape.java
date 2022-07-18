package Inheritance.TwoDShape_1.TwoDShape_2;

// Закрытые члены класса не наследуются.

// Этот код не пройдёт компиляцию.

// Класс, описывающий двумерные объекты
public class TwoDShape {
    private double width;   // теперь эти переменные
    private double height;  // объявлены как закрытые

    void showDim() {
        System.out.println("Ширина и высота - " + width + " " + height);
    }
}
