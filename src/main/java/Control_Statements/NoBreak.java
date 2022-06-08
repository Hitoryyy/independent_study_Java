package Control_Statements;

public class NoBreak {

    // Демонстрация использования оператора switch без оператора break
    public static void main(String[] args) {
        int i;

        for (i = 0; i <= 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("i меньше единицы");
                case 1:
                    System.out.println("i меньше двух");
                case 2:
                    System.out.println("i меньше трёх");
                case 3:
                    System.out.println("i меньше четырёх");
                case 4:
                    System.out.println("i ментше пяти");
            }
            System.out.println();
        }
    }
}
