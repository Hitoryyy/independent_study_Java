package Control_Statements;

public class ContToLable {
    // Применить оператор continue с меткой
    public static void main(String[] args) {
        outerloop:
        for (int i = 1; i < 10; i++) {
            System.out.print("\nВнешний цикл: проход " + i +
                    ", внутренний цикл: ");
            for (int j = 1; j < 10; j++) {
                if(j == 5) continue outerloop; // продолжить внешний цикл
                System.out.print(j);
            }
        }
    }
}
