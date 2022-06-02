package JavaBasics;

public class Example3 {
    //Демонстрация различий между типами int и double.

    public static void main(String[] args) {
        int var; //Объявить целочисленную переменную
        double x; //Объявить переменную с плавающей точкой

        var = 10;//Присвоить пременной var значение 10

        x = 10.0;//Присвоить переменной x значение 10.0

        System.out.println("Начальное значение переменной var: " + var);
        System.out.println("Начальное значение переменной x: " + x);
        System.out.println(); //Вывести пустую строку

        //Разделить значения обеих переменных на 4
        var = var / 4;
        x = x / 4;

        System.out.println("Значение переменной var после деления: " + var);
        System.out.println("Значение переменной x после деления: " + x);
    }
}
