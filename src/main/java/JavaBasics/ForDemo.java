package JavaBasics;

public class ForDemo {
    //демонстрация пременения цикла for.
    public static void main(String[] args) {
        int count;

        for (count = 0; count < 5; count++)
        //for (count = 0; count < 5; count = count + 1)
            System.out.println("Значение счётчика: " + count);
        System.out.println("Готово!");
    }
}
