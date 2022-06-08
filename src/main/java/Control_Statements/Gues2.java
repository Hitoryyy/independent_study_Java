package Control_Statements;

import java.io.IOException;

public class Gues2 {

    // Игра в угадывание букв, вторая версия
    public static void main(String[] args) throws IOException {

        char ch, answer = 'S';
        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.print("Попытайтесь её угадать: ");

        ch = (char) System.in.read(); // получить символ с клавитуры
        if (ch == answer) System.out.println("*** Правильно! ***");
        else System.out.println("... Извините, вы не угадали.");
    }
}
