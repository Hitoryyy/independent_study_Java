package Introduction_To_Types_Data_And_Operations_Above_Them;

public class Inches {
    /*
        Расчёт кубических дюймов в кубе объёмом в 1 куб. милю
    */

    public static void main(String[] args) {
        long ci;
        long im;

        im = 5280 * 12;
        ci = im * im * im;

        System.out.println("В одной кубической миле содержится " + ci + " кубических дюймов");
    }
}
