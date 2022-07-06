package Additional_Type_Information_Data_And_Operations;

// Демонстрация одномерного массива
public class ArrayDemo {
    public static void main(String[] args) {
        int sample[] = new int[10];
        int i;

        for (i = 0; i < 10; i = i + 1)
            sample[i] = i;

        for (i = 0; i < 10; i = i + 1)

            System.out.println("Элемент[" + i + "]: " +
                    sample[i]);
    }
}
