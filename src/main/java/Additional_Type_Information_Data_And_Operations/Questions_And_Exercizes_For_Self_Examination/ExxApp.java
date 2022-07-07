package Additional_Type_Information_Data_And_Operations.Questions_And_Exercizes_For_Self_Examination;

// Вопросы и урпажнения для самопроверки
public class ExxApp {
    public static void main(String[] args) {
        // Question_1 Вопрос_1
        double[] arr = new double[12];
        double arr1[] = new double[12];

        // Question_2 Вопрос_2
        int[] arr2 = {1, 2, 3, 4, 5};

        // Question_3 Вопрос_3
        // Нахождение среднего арифметического массива состоящего из 10 элементов
        double[] arr4 = {5.3, 2.6, 9.4, 3.5, 4.3, 1.1, 6.3, 6.7, 5.2, 7.0};
        int sum = 0;
        for (int i = 0; i < arr4.length; i++) {
            sum += arr4[i];
        }
        System.out.println("Среднее арифметическое элементов массива arr4: " + sum / arr4.length);

        // Question_6 Вопрос_6
        System.out.println("Мне нравится Java" .length());
        System.out.println("Мне нравится Java" .charAt(6));

        // Question_8 Вопрос_8
        int x = 0, y;
        y = x < 0 ? 10 : 20;
    }
}
