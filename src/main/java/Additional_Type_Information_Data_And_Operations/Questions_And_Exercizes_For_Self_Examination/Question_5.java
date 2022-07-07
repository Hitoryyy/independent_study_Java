package Additional_Type_Information_Data_And_Operations.Questions_And_Exercizes_For_Self_Examination;

// Демонстрация пузырьковой сортировки строк
public class Question_5 {
    public static void main(String[] args) {
        String[] strs = {"this", "is", "a", "test", "of", "a", "string", "sort"};

        int a, b;
        String t;
        int size;

        size = strs.length; // Кол-во сортируемых элементов

        // Отобразить исходный массив
        System.out.println("Исходный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + strs[i]);
        }
        System.out.println();

        // Пузырьковая сортировка строк
        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                // поменять элементы местами при нарушении
                // порядка их следования
                if (strs[b - 1].compareTo(strs[b]) > 0) {
                    t = strs[b - 1];
                    strs[b - 1] = strs[b];
                    strs[b] = t;
                }
            }
        }

        // Отобразить отсортированный массив
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + strs[i]);
        }
        System.out.println();
    }
}
