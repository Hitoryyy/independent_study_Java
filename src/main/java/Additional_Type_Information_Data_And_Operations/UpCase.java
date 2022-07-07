package Additional_Type_Information_Data_And_Operations;

// Преобразование строчных букв английского алфавита в прописные
public class UpCase {
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);

            // В следующем операторе сбрасывается шестой бит.
            // После этого в переменной ch будет храниться код
            // символа прописной буквы.
            ch = (char) ((int) ch & 65503);

            System.out.print(ch + " ");
        }
    }
}
