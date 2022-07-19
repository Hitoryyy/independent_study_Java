package Inheritance.TwoDShape_1.X_Y;

public class IncompatibleRef {
    public static void main(String[] args) {
        X x = new X(10);
        X x2;
        Y y = new Y(5);

        x2 = x; // Допустимо, так как обе переменные одного типа

        // x2 = y; // Ошибка, так как переменные разных типов
    }
}
