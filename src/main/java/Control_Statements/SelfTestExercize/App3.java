package Control_Statements.SelfTestExercize;

public class App3 {
    /*
        Использовнаие цикла for для формирования
        геометрической прогрессии 1, 2, 4, 8, 16, 32 и т.д.
     */

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i += i) {
            System.out.print(i + " ");
        }
    }
}
