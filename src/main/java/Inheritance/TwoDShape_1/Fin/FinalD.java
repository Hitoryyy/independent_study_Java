package Inheritance.TwoDShape_1.Fin;

public class FinalD {
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();

        //  При вызове используются константы,
        //  объявленные с помощью ключевого слова final
        System.out.println(err.getErrorMsg(err.OUTERR));
        System.out.println(err.getErrorMsg(err.DISKERR));
    }
}
