package Introduction_To_Types_Data_And_Operations_Above_Them;

public class NestVar {
    /*
        В этой программе предпринимается попытка объявить во внутренней области
        действия переменную с таким же именем, как у переменной,
        объявленной во внешней области действия.
        *** Эта программа не пройдёт компиляцию ***
     */
    public static void main(String[] args) {
        int count;

        for (count = 0; count < 10; count = count + 1) {
            System.out.println("Значение count: " + count);

            //int count; // Недопустимо!!!
            for (count = 0; count < 2; count++)
                System.out.println("В этой программе есть ошибка!");
        }
    }
}
