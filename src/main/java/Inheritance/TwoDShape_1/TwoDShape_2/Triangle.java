package Inheritance.TwoDShape_1.TwoDShape_2;

// Подкласс для представления теругольников,
// производный от клсса TwoDShape
public class Triangle extends TwoDShape{
    String style;

   // double area() {
       // return width * height / 2; // Ошибка! Доступ запрещён.
    // }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
