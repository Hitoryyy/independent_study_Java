package Inheritance.TwoDShape_1.ABC_3;

/*
    Методы с разными сигнатурами не переопределяются,
    а перегружаются
 */
public class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    // Отобразить переменные i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}
