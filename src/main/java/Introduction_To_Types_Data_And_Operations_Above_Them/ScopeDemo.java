package Introduction_To_Types_Data_And_Operations_Above_Them;

public class ScopeDemo {
    // Демонстрация области действия блока кода
    public static void main(String[] args) {
        int x; // Эта переменная доступна для всего кода в методе main

        x = 10;
        if (x == 10) { // Начало новой области действия

            int y = 20; // Эта пременная доступна только в данном блоке

            // Обе переменные, "x" и "y", доступны в данном кодовом блоке

            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // Ошибка! В этом месте переменная "y" недоступна

        // А переменная "x"  по-прежнему доступна
        System.out.println("x is " + x);
    }
}
