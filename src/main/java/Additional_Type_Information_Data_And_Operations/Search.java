package Additional_Type_Information_Data_And_Operations;

// Поиск в массиве с использованием расширенного цикла for
public class Search {
    public static void main(String[] args) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;

        // Использовать цикл for-each поиска значения
        // переменной val в массиве nums
        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Значение найдено!");
    }
}
