package More_Infomation_About_Methods_And_Classes;

// Перегрузка метода с переменным числом аргументов
// и неопределённость в выборе перегруженной версии.
//
// В этой программе имеется ошибка, и
// поэтому она не будет компилироваться.
public class VarArgs4 {
    // Использование списка аргументов переменной длины типа int
    static void vaTest (int ... v) {
        // ...
    }

    // Использование списка аргументов переменной длины типа boolean
    static void vaTest(boolean ... v){
        // ...
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3); // OK
        vaTest(true, false, false); // OK

        // vaTset(); // Ошибка: неопределённость вызова!
    }
}
