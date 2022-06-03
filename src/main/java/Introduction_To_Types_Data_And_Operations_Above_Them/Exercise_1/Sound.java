package Introduction_To_Types_Data_And_Operations_Above_Them.Exercise_1;

public class Sound {
    /*
        Упражнение 2.1

        Рассчитать расстояние до места вспышки молнии, звук от которого
        доходит до наблюдателя через 7,2 секунды.
     */
    public static void main(String[] args) {
        double dist;

        dist = 1100 * 7.2;

        System.out.println("Расстояние до места вспышки молнии " + "составляет " + dist + " футов");


        // Прохождение звука от источника до объекта

        double echot = 4.3;

        dist = 1100 * (echot / 2);

        System.out.println("Расстояние до объекта равно " + dist + " футов");
    }
}
