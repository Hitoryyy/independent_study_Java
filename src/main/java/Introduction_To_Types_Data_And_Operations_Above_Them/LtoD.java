package Introduction_To_Types_Data_And_Operations_Above_Them;

public class LtoD {
    // Демонстрация автоматического преобразования типа long в тип double
    public static void main(String[] args) {
        long L;
        double D;

        L = 100123285L;
        D = L;

        System.out.println("L и D: " + L + " " + D);

        // *** Эта программа не пройдёт компиляцию ***

        /*
            long L;
            double D;

            D = 100123285.0;
            L = D; //Ошибка!!!

            System.out.println("L и D: " + L + " " + D);
         */
    }
}
