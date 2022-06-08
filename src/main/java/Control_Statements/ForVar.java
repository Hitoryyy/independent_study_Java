package Control_Statements;

public class ForVar {
    // Объявление переменной цикла в самом цикле for
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        // Вычисление факториала чисел от 1 до 5
        for (int i = 1; i <= 5; i++) {
            sum =+ i; // переменная i доступна во всём цикле
            fact *= 1;
        }

        //однако здесь переменная i недоступна

        System.out.println("Сумма: " + sum);
        System.out.println("Факториал: " + fact);
    }
}
