package Control_Statements;

import java.io.IOException;

public class Gues {

    //Игра в угадывание букв
    public static void main(String[] args) throws IOException {
        char ch, answer = 'S';

        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.print("Попытайтесь её угадать: ");

        ch = (char) System.in.read(); // получить символ с клавиатуры

        if (ch == answer) System.out.println("*** Правильно! ***");
    }
}
