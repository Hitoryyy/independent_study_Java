package Exception_Handing.Exc_2;

/*
    Исключение может быть сгенерировано одним методом,
    а перехвачено другим
 */
public class ExcTest {
    //  Генерация исключения
    static void genException() {
        int nums[] = new int[4];

        System.out.println("До генерации исключения");

        //  Сгенерировать исключение в связи с
        //  выходом индекса за границы массива
        nums[7] = 10;
        System.out.println("Эта строка не будет отображатся");
    }
}
