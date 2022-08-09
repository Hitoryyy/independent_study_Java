package Multithreading_Programming.MThreadIsAlive;

class MyThread implements Runnable {
    Thread thrd;

    //  Создать новый поток
    MyThread (String name) {
        thrd = new Thread(this, name);
        thrd.start();   //  начать поток
    }

    //  Начать выполнение нового потока
    public void run() {
        System.out.println(thrd.getName() + " - запуск ");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("В " + thrd.getName() + ", счётчик: " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " -прерван ");
        }

        System.out.println(thrd.getName() + " - завершение ");
    }
}
