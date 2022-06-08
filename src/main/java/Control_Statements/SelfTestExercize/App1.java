package Control_Statements.SelfTestExercize;

import java.io.IOException;

/*
    Программа позволяет воодить символы,
    при нажатии на '.' - завершает работу,
    подсчитывает кол-во введённых пробелов.
 */

public class App1 {
    public static void main(String[] args) throws IOException {
        char ch;
        int count_spaces = 0;

        System.out.println("Вводите любые символы: ");
        System.out.println("Для остановки введите: '.' ");

        do {
            ch = (char) System.in.read();
            if (ch == ' ') count_spaces++;
        } while (ch != '.');

        System.out.println("Кол-во пробелов: " + count_spaces);
    }
}
