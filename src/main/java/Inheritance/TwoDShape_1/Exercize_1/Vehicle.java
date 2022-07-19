package Inheritance.TwoDShape_1.Exercize_1;

// Упражнение 7.1
//
// Создание подкласса класса Vehicle для грузовиков
public class Vehicle {
    private int passengers; // количество пассажиров
    private int fuelcap;    // объём топливного бака в галлонах
    private int mpg;        // потребление топлива в милях на галлон

    // Конструктор класса Vehicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Возвратить дальность поездки транспортного средства
    int range() {
        return mpg * fuelcap;
    }

    // Вычислить объём топлива, требующегося
    // для прохождения заданного пути
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    // Методы доступа к переменным экземпляра
    int getPassengers() {
        return passengers;
    }

    void setPassengers(int p) {
        passengers = p;
    }

    int getFuelcap() {
        return fuelcap;
    }

    void setFuelcap (int f) {
        fuelcap = f;
    }

    int getMpg() {
        return mpg;
    }

    void setMpg(int m) {
        mpg = m;
    }
}
