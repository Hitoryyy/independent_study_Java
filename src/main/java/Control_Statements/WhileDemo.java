package Control_Statements;

public class WhileDemo {
    // Демонстрация использования цикла while
    public static void main(String[] args) {
        char ch;

        // вывести буквы английского алфавита, используя цикл while
        ch = 'a';
        while (ch <= 'z') {
            System.out.print(ch);
            ch++;
        }
    }
}
