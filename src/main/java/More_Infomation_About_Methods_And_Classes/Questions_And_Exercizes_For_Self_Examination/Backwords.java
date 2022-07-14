package More_Infomation_About_Methods_And_Classes.Questions_And_Exercizes_For_Self_Examination;

// Отображение символов строки в обратном порядке
// с помощью рекурсии
public class Backwords {
    String str;

    Backwords (String s) {
        str = s;
    }

    void backward(int idx) {
        if (idx != str.length() - 1) {
            backward(idx + 1);
        }
        System.out.print(str.charAt(idx));
    }
}

class BWDemo {
    public static void main(String[] args) {
        Backwords s = new Backwords("This is a test");

        s.backward(0);
    }
}
