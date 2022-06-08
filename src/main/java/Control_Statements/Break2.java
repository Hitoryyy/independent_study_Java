package Control_Statements;

import java.io.IOException;

public class Break2 {
    // Чтение вводимых данных до тех пор, пока не будет получена буква q
    public static void main(String[] args) throws IOException {
        char ch;
        for (; ;) {
            ch = (char) System.in.read(); // получить символ с клавиатуры
            if (ch == 'q') break;
        }
        System.out.println("Вы нажали клавишу q!");
    }
}
