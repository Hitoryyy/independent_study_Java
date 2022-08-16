package Multithreading_Programming.MyTh_2;

//  Усовершенствованная версия класса MyThread
class MyThread implements Runnable {
    Thread thrd;

    //  Создать новый поток.
    MyThread(String name) {
        thrd = new Thread(this, name);
        thrd.start();   //  Зпустить поток.
    }

    //  Начать выполнение нового потока.
    public void run() {
        System.out.println(thrd.getName() + " - запуск");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("В " + thrd.getName() + ", счётчик: " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - прерван");
        }
        System.out.println(thrd.getName() + " завершение");
    }
}
