package Packages_And_Interfaces.MyIFi;

//  Использование интерфейсного метода по умолчанию
public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();

        //  Вызов метода getUserID() возможен, поскольку он явно
        //  реализован классом MyIFImp
        System.out.println("Идентификатор пользователя " + obj.getUserID());

        //  Вызов метода getAdminID() также возможен, поскольку
        //  предоставляется его реализация по умолчанию
        System.out.println("Идентификатор администратора: " + obj.getAdminID());

        MyIFImp2 obj1 = new MyIFImp2();

        System.out.println(obj1.getAdminID());
    }

}
