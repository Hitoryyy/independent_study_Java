package Inheritance.TwoDShape_1.ABC_3;

// создание подкласса путём расширения класса A
public class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // Перегрузить метод show()
    void show(String msg) {
        System.out.println(msg + k);
    }
}
