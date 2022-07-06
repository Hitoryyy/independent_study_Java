package Additional_Type_Information_Data_And_Operations;

// Использование разновидности for-each цикла for
public class ForEach {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // Использовать разновидность for-each цикла for
        // для суммирования и отображения значений
        for (int x : nums) {
            System.out.println("Значение: " + x);
            sum += x;
        }

        System.out.println("Сумма: " + sum);

        // Суммирование первых 5 элементов массива
        for (int x : nums) {
            System.out.println("Значение: " + x);
            sum += x;
            if (x == 5) break; // прервать цикл по достижении значения 5
        }

        System.out.println("Сумма: " + sum);
    }
}