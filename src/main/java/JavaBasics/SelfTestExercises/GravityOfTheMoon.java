package JavaBasics.SelfTestExercises;

public class GravityOfTheMoon {
    public static void main(String[] args) {
        //Вычисление веса на Луне
        double weight = 80;

        double weight_of_the_moon = (weight / 100) * 17;

        System.out.println("Ваш вес на Луне будет равен: " + weight_of_the_moon);

        //Решение из учебника
        double earthweight = 82;

        double moonweight = earthweight * 0.17;

        System.out.println(earthweight + " земных фунтов эквивалентны " + moonweight + " лунных фунтов.");
    }
}
