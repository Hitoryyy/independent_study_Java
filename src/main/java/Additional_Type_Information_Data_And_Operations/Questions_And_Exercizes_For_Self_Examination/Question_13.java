package Additional_Type_Information_Data_And_Operations.Questions_And_Exercizes_For_Self_Examination;

// Нахождение минимального и максимального значений в массиве
public class Question_13 {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int min, max;

        nums[0] = 3;
        nums[1] = 7;
        nums[2] = 44;
        nums[3] = 32;
        nums[4] = 9;
        nums[5] = 1;
        nums[6] = 2;
        nums[7] = 6;
        nums[8] = 4;
        nums[9] = 123;

        min = max = nums[0];
        for (int v : nums) {
            if (v < min) {
                min = v;
            }
            if (v > max) {
                max = v;
            }
        }
        System.out.println("Максимальный элемент: " + max + " Минимальный элемент: " + min);
    }
}
