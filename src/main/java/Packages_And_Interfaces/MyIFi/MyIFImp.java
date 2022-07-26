package Packages_And_Interfaces.MyIFi;

//  Реализация интерфейса MyIF
public class MyIFImp implements MyIF {
    //  Реализации подлежит лиш метод getUserID() интерфейса MyIF.
    //  Делать это для метода getAdmin() необязательно, поскольку
    //  при необходимости может быть использована его реализация,
    //  заданная по умолчанию.
    public int getUserID() {
        return 100;
    }
}
