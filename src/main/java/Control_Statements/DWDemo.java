package Control_Statements;

import java.io.IOException;

public class DWDemo {
    // Демонстрация использования цикла do-while
    public static void main(String[] args) throws IOException {
        char ch;

        do {
            System.out.
                    print("Нажмите нужную клавишу, а затем клавишу <ENTER>: ");
            ch = (char) System.in.read(); // получить символ с клавиатуры
        } while (ch != 'q');
    }
}
