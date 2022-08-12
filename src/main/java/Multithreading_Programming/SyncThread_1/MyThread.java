package Multithreading_Programming.SyncThread_1;

class MyThread implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    //  Создать новый поток
    MyThread(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();   //  запустить поток
    }

    //  Начать выполнение нового потока
    public void run() {
        int sum;

        System.out.println(thrd.getName() + " - запуск");

        synchronized (sa) {
            answer = sa.sumArray(a);
        }
        System.out.println("СУММА для " + thrd.getName() + ": " + answer);
        System.out.println(thrd.getName() + " - завершение");
    }
}
