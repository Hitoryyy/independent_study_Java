package Introduction_To_Types_Data_And_Operations_Above_Them;

public class Hypot {
    /*
        Определение длины гипотенузы, исходя из длины катетов,
        по теореме Пифагора
     */
    public static void main(String[] args) {
        double x, y, z;

        x = 3;
        y = 4;

        z = Math.sqrt(x * x + y * y);

        System.out.println("Длина гипотенузы: " + z);
    }
}
