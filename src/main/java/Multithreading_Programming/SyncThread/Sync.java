package Multithreading_Programming.SyncThread;

class Sync {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};

        MyThread mt1 = new MyThread("Robot #1", a);
        MyThread mt2 = new MyThread("Robot #2", a);
    }
}
