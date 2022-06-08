package Control_Statements;

import java.io.IOException;

public class KbIn {
    public static void main(String[] args) throws IOException {

        char ch;

        System.out.println("Нажмите нужню клавишу, а затем " +
                "клавишу ENTER: ");
        ch = (char) System.in.read(); // получить символ

        System.out.println("Вы нажали клавишу " + ch);
    }
}
