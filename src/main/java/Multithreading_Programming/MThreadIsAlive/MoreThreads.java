package Multithreading_Programming.MThreadIsAlive;

//  Использование метода isAlive().
class MoreThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        MyThread mt1 = new MyThread("Robot #1");
        MyThread mt2 = new MyThread("Robot #2");
        MyThread mt3 = new MyThread("Robot #3");

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }
        } while (mt1.thrd.isAlive() || mt2.thrd.isAlive() || mt3.thrd.isAlive());
        System.out.println("Завершение основного потока");
    }
}
