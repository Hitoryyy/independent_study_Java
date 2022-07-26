package Packages_And_Interfaces.Questions_And_Exercise.Vehicle;

public interface IVehicle {
    //  Вернуть дальность поездки транспортного средства
    int range();

    //  Вычислить объём топлива, требующегося
    //  для прохождения заданного пути
    double fuelneeded(int miles);

    //  Методы доступа к переменным экземпляра
    int getPassengers();
    void setPassengers();
    int getFuelcap();
    void setFuelcap();
    int getMpg();
    void setMpg();
}
