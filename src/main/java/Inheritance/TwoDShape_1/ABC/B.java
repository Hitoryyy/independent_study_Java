package Inheritance.TwoDShape_1.ABC;

// Создать подкласс, расширяющий класс A
public class B extends A {
    int i; // эта переменная i скрывает переменную i из класса A

    B(int a, int b) {
        super.i = a;    // переменная i из класса A
        i = b;          // переменная i из класса B
    }

    void show() {
        System.out.println("i в суперклассе: " + super.i);
        System.out.println("i в подклассе: " + i);
    }
}
