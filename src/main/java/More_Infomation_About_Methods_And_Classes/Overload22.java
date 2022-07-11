package More_Infomation_About_Methods_And_Classes;

// Добавление версии f(byte)
public class Overload22 {
    void f(byte x) {
        System.out.println("Внутри f(byte): " + x);
    }

    void f(int x) {
        System.out.println("Внутри f(int): " + x);
    }

    void f(double x) {
        System.out.println("Внутри f(double): " + x);
    }
}

class TypeConv1 {
    public static void main(String[] args) {
        Overload22 ob = new Overload22();

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float f = 11.5F;

        ob.f(i); // вызов метода ob.f(int)
        ob.f(d); // вызов метода ob.f(double)

        ob.f(b); // вызов метода ob.f(byte) без преобразования типов

        ob.f(s); // вызов метода ob.f(int) с преобразованием типов
        ob.f(f); // вызов метода ob.f(double) с преобразованием типов
    }
}
