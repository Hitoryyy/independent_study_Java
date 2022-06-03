package Introduction_To_Types_Data_And_Operations_Above_Them.Exercise_2;

public class LogicalOpTable {
    //Отображение таблицы истинности для логических операций
    public static void main(String[] args) {
        boolean p;
        boolean q;

        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = true; q = true;

        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = true; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = false; q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = false; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));
    }
}
