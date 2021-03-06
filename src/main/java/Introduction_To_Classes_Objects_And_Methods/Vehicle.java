package Introduction_To_Classes_Objects_And_Methods;

/*
    Программа, в которой используется класс Vehicle
 */

//-------------------------------------------------------------------------//
// Добавление конструктора

class Vehicle {
    int passengers; // кол-во пассажиров
    int fuelcap; // ёмкость топливного бака
    int mpg; // потребление топлива в милях на галлон

    // Добавление метода range() в класс Vehicle
    // Отобразить дальность поездки транспортного средства
   /* void range() {
        System.out.println("Дальность - " + fuelcap * mpg + " миль.");
    }*/

    //-------------------------------------------------------------------------//
    // Это конструктор класса Vehicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    //-------------------------------------------------------------------------//
    // Возврат дальности поездки
    // Определить дальность поездки транспортного средства
    int range() {
        return mpg * fuelcap;
    }

    //-------------------------------------------------------------------------//
    /*
        Добавление параметризованного метода, в котором производится
        расчёт объёма топлива, необходимого транспортному средству для
        преодоления заданного расстояния.
     */

    // Расчитать объём топлива, необходимого транспортному
    // средству для преодоления заданного расстояния

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

//-------------------------------------------------------------------------//

class VehConsDemo {

    public static void main(String[] args) {

        // Полностью сконструировать объекты транспортных средств
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportscar = new Vehicle(2,14,12);

        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);

        System.out.println("Для преодоления " + dist +
                " миль мини-фургону требуется " +
                gallons + " галлонов топлива");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("Для преодоления " + dist +
                " миль спортивному автомобилю требуется " +
                gallons + " галлонов топлива");

    }
}