package Introduction_To_Types_Data_And_Operations_Above_Them;

public class CharArithDemo {
    // С символьными переменными можно обращаться, как с целочисленными

    public static void main(String[] args) {
        char ch;

        ch = 'X';
        System.out.println("ch содержит " + ch);

        ch++; // инкрементировать переменную ch
        System.out.println("теперь ch содержит " + ch);

        ch = 90; // присвоить переменной ch значение Z
        System.out.println("теперь ch содержит " + ch);
    }
}
