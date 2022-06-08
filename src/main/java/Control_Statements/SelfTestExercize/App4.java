package Control_Statements.SelfTestExercize;

import java.io.IOException;

public class App4 {
    //Смена регистра символов

    public static void main(String[] args) throws IOException {
        char ch;
        int changes = 0;

        System.out.println("Вводите символы буквы с клавиатуры: ");
        System.out.print("Для остановки введите символ точки.");

        do {
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z') {
                ch -= 32;
                changes++;
                System.out.println(ch);
            } else if (ch >= 'A' & ch <= 'Z'){
                ch += 32;
                changes++;
                System.out.println(ch);
            }
        } while (ch != '.');
        System.out.println("Изменений регистра: " + changes);
    }
}
