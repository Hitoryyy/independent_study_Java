package Multithreading_Programming.MThreadJoin;

class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        MyThread mt1 = new MyThread("Robot #1");
        MyThread mt2 = new MyThread("Robot #2");
        MyThread mt3 = new MyThread("Robot #3");

        try {
            mt1.thrd.join();
            System.out.println("Robot #1 - присоединён");
            mt2.thrd.join();
            System.out.println("Robot #2 - присоединён");
            mt3.thrd.join();
            System.out.println("Robot #3 - присоединён");
        }
        catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }
        System.out.println("Завершение основного потока");
    }
}
