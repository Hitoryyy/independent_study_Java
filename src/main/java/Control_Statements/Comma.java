package Control_Statements;

public class Comma {
    // Применение запятых в операторе цикла for
    public static void main(String[] args) {
        int i, j;

        for (i = 0, j = 10; i < j; i++, j --)
            System.out.println("i и j: " + i + " " + j);
    }
}
