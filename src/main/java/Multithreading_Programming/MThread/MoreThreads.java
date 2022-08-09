package Multithreading_Programming.MThread;

class MoreThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        MyThread mt1 = new MyThread("Robot #1");
        MyThread mt2 = new MyThread("Robot #2");
        MyThread mt3 = new MyThread("Robot #3");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }
        }
        System.out.println("Завершение основного потока");
    }
}
