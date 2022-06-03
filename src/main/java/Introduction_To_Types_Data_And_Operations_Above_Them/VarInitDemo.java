package Introduction_To_Types_Data_And_Operations_Above_Them;

public class VarInitDemo {
    // Демонстрация времени жизни переменной
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = -1; // переменная y инициализируется при каждом входе в блок
            System.out.println("y: " + y); // всегда выводится значение -1
            y = 100;
            System.out.println("Изменённое значние y: " + y);
        }
    }
}
