package JavaBasics.Exercise_1;

public class GalToLit {
    /*
    Упражнение 1.1
    Программма перевода галлонов в литры.
    */

    public static void main(String[] args) {
        double gallons;//в этой переменной хранится значение,
                       //выражающее объём жидкости в галлонах
        double liters;//в этой переменной хранится значение,
                      //выражающее объём жидкости в литрах

        gallons = 10; //начальное значение соответствует 10 галлонам

        liters = gallons * 3.7854; // перевести в литры

        System.out.println(gallons + " галлонам соответствует " + liters + " литров");
    }
}
