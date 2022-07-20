package Inheritance.TwoDShape_1.ABC_2;

public class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // Отображение переменной k
    void show() {
        super.show(); // Использовать ключевое слово super для вызова версии метода show(), определённой в суперклассе А
        System.out.println("k: " + k);
    }
}
