package Control_Statements;

import java.io.IOException;

public class Gues3 {

    // Игра в угывание букв, третья версия
    public static void main(String[] args) throws IOException {

        char ch, answer = 'S';

        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.print("Попытайтесь её угадать: ");

        ch = (char) System.in.read();

        if (ch == answer) System.out.println("*** Правильно! ***");
        else {
            System.out.print("... Извините, нужная буква находится ");
            // вложенный оператор if
            if (ch < answer)
                System.out.println("ближе к концу алфавита");
            else System.out.println("ближе к началу алфавита");
        }
    }
}
