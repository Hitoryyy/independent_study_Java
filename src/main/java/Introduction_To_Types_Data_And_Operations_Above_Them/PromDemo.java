package Introduction_To_Types_Data_And_Operations_Above_Them;

public class PromDemo {
    // Неожиданный результат повышения типов!
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b;

        b = 10;
        b = (byte) (b * b); // cast needed!!

        System.out.println("i and b: " + i + " " + b);
    }
}
