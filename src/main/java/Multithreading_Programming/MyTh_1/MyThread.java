package Multithreading_Programming.MyTh_1;

//  Создание потока путём реализации интерфейса Runnable
class MyThread implements Runnable {
    String thrdName;

    MyThread(String name) {
        thrdName = name;
    }

    //  Точка входа в поток.
    public void run() {
        System.out.println(thrdName + " - запуск");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("В " + thrdName + ", счётчик: " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(thrdName + " - прерван");
        }
        System.out.println(thrdName + " - завершение");
    }
}
