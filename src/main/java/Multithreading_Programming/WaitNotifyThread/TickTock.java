package Multithreading_Programming.WaitNotifyThread;

//  Использование методов wait() и notify() для имитации часов
class TickTock {
    String state;   //  содержит сведения о состоянии часов

    synchronized void tick(boolean running) {
        if (!running) { //  остановить часы
            state = "ticked";
            notify();   //  уведомить потоки
            return;
        }

        System.out.print("Tick ");

        state = "ticked";   //  установить текущее состояние
                            //  после такта "тик"
        notify();   //  позволить выполняться методу tock()

        try {
            while (!state.equals("tocked")) {
                wait(); //  ожидать до завершения метода tock()
            }
        }
        catch (InterruptedException exc) {
            System.out.println("Прерывание потока");
        }
    }

    synchronized void tock(boolean running) {
        if (!running) { //  остановить часы
            state = "tocked";
            notify();   //  уведомить ожидающие потоки
            return;
        }

        System.out.println("Tock");

        state = "tocked";   //  установить текущее состояние
                            //  после такта "так"
        notify();   //  позволить выполняться методу tick()
        try {
            while (!state.equals("ticked")) {
                wait(); //  ожидать до завершения метода tick()
            }
        }
        catch (InterruptedException exc) {
            System.out.println("Прерывание потока");
        }
    }
}
