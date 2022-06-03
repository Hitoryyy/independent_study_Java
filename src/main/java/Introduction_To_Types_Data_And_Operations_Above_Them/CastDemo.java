package Introduction_To_Types_Data_And_Operations_Above_Them;

public class CastDemo {
    // Демонстрация приведения типов
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        i = (int) (x / y); // привести тип double к типу int
        System.out.println("Целочисленный результат деления x / y: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Значение b: " + b);

        i = 257;
        b = (byte) i;
        System.out.println("Значение b: " + b);

        b = 88; //представление символа X в коде ASCII
        ch = (char) b;
        System.out.println("ch: " + ch);
    }
}
