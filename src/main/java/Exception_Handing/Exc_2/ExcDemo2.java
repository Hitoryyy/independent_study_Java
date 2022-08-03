package Exception_Handing.Exc_2;

public class ExcDemo2 {
    public static void main(String[] args) {
        try {
            ExcTest.genException();
        }
        //  А здесь исключение перехватывается
         catch (ArrayIndexOutOfBoundsException exc) {
             System.out.println("Выход за границы массива!");
         }
        System.out.println("После оператора catch");
    }
}
