package Control_Statements;

public class DecrFor {
    //Цикл for, выполняющийся с отрицательным приращением переменной
    public static void main(String[] args) {

        int x;

        for (x = 100; x > -100; x -=5) {
            System.out.println(x);
        }
    }
}
