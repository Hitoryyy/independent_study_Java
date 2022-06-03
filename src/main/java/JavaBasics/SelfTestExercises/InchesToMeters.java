package JavaBasics.SelfTestExercises;

public class InchesToMeters {
    /* Эта программа показывает таблицу
       преобразования дюймов в метры
    */
    public static void main(String[] args) {
        double inches, meters;
        int counter = 0;

        for (inches = 1; inches <= 144; inches++) {
            meters = inches / 39.37;//преобразовать в метры
            System.out.println(inches + " дюймов равно " + meters + " метров. ");
            counter++;
            //Каждая 12-я выводимая строка должна быть пустой
            if (counter == 12) {
                System.out.println();
                counter = 0; //сбросить счётчик
            }
        }
    }
}
