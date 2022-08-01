package Exception_Handing.Exc_11;

// Использование методов класса Throwable
class ExcTest {
    static void genException() {
        int nums[] = new int[4];

        System.out.println("До генерации исключения");

        //  Сгенерировать исключение в связи с
        //  выходом индекса за границы массива
        nums[7] = 10;
        System.out.println("Эта строка не будет отображаться");
    }
}

