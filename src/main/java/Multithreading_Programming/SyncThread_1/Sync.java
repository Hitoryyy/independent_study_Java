package Multithreading_Programming.SyncThread_1;

class Sync {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};

        MyThread mt1 = new MyThread("Robot #1", a);
        MyThread mt2 = new MyThread("Robot #2", a);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }
    }
}
