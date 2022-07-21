package Inheritance.TwoDShape_1.ABC_3;

public class Overload {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);

        subOb.show("k: "); // вызывается метод show() из класса B
        subOb.show(); // вызывается метод show() из класса A
    }
}
