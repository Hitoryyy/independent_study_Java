package Multithreading_Programming.Exercize_1;

/*
    Упражнение 11.1

    Расширение класса Thread
 */

class MyThread extends Thread {

    //  Создать новый поток.
    MyThread(String name) {
        super(name);    // присвоить имя потоку
        start();        // зпустить поток
    }

    //  Начать выполнение нового потока.
    public void run() {
        System.out.println(getName() + " - запуск");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("В " + getName() + ", счётчик: " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(getName() + " - прерван");
        }
        System.out.println(getName() + " завершение");
    }
}
