package Introduction_To_Types_Data_And_Operations_Above_Them;

public class DynInit {
    // Демонстрация динамической инициализации
    public static void main(String[] args) {
        double redius = 4, height = 5;

        // Переменная volume инициализируется динамически
        // во время выполнения программы
        double volume = 3.1416 * redius * height;

        System.out.println("Объём: " + volume);
    }
}
