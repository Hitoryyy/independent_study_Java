package Multithreading_Programming.Suspend_Resume_Stop;

class Suspend {
    public static void main(String[] args) {
        MyThread ob1 = new MyThread("My thread");

        try {
            Thread.sleep(100); //   позволить потоку ob1 начать выполнение

            ob1.mysuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Остановка потока");
            ob1.mystop();
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }

        //  Ожидать завершения потока
        try {
            ob1.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }

        System.out.println("Выход из основного потока");
    }
}
