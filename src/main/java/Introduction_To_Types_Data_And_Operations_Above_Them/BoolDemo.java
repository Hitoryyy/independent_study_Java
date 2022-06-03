package Introduction_To_Types_Data_And_Operations_Above_Them;

public class BoolDemo {
    // Демонстрация использования логических значений
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("Значение b: " + b);
        b = true;
        System.out.println("Значение b: " + b);

        // Логическое значение можно использовать для
        // управления оператором if
        if (b) System.out.println("Эта инструкция выполняется");

        b = false;
        if (b) System.out.println("Эта инструкция не выполняется");

        // В результате выполнения сравнения
        // получается логическое значение
        System.out.println("Результат сравнения 10 > 9: " + (10 > 9));
    }
}
