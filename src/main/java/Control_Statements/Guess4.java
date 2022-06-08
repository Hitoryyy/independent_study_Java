package Control_Statements;

import java.io.IOException;

public class Guess4 {
    // Игра в угадывание букв, четвёртая версия
    public static void main(String[] args) throws IOException {
        char ch, ignore, answer = 'S';

        do {
            System.out.println("Задумана буква из диапазона A-Z.");
            System.out.print("Попытайтесь её угадать: ");

            // Получить символ с клавиатуры
            ch = (char) System.in.read();
            // Отбросить все остальные символы во входном буфере
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer) System.out.println("** Правильно! **");
            else {
                System.out.print("...Извините, нужная буква находится ");
                if (ch < answer)
                    System.out.println("ближе к концу алфавита");
                else System.out.println("ближе к началу алфавита");
                System.out.println("Повторите попытку! \n");
            }
        } while (answer != ch);
    }
}
