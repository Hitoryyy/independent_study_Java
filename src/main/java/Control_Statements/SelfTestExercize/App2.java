package Control_Statements.SelfTestExercize;

public class App2 {
    /*
        Цикл for с перебором значений
        от 1000 до 0, с шагом -2
     */
    public static void main(String[] args) {

        /*for (int i = 1000; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }*/

        for (int i = 1000; i >= 0; i -= 2) {
            System.out.println(i);
        }
    }
}
