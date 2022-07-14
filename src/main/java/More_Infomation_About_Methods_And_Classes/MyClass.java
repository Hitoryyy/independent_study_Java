package More_Infomation_About_Methods_And_Classes;

// Сравнение видов доступа public и private
public class MyClass {
    private int alpha; // закрытый доступ
    public int beta; // открытый доступ
    int gamma; // тип доступа по умолчанию (по сути, public)

    /*
        Методы доступа к переменной alpha. Члены класса могут
        обращаться к закрытым членам того же класса.
     */
    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}

class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        /*
            Доступ к переменной alpha возможен только с помощью
            специально предназначенных для этой цели методов.
         */
        ob.setAlpha(-99);
        System.out.println("ob.alpha: " + ob.getAlpha());

        // Обратиться к переменной alpha так, как показано ниже, нельзя
        // ob.alpha = 10; // Ошибка: alpha - закрытая переменная!

        // Следующие обращения вполне доступны, так как
        // переменные beta и gamma являются открытыми
        ob.beta = 99;
        ob.gamma = 99;
    }
}
