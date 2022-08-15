package Multithreading_Programming.TickTockNotWaitAndNotify;

//  В этой версии программы вызовы методов wait() и notify() отсутствуют
class TickTock {

    String state;   //  содержит сведения о состоянии часов

    synchronized void tick(boolean running) {
        if (!running) { //  остановить часы
            state = "ticked";
            return;
        }

        System.out.println("Tick");

        state = "ticked";   //  установить текущее состояние
                            //  после такта "тик"
    }

    synchronized void tock(boolean running) {
        if (!running) { //  остановить часы
            state = "tocked";
            return;
        }

        System.out.println("Tock");

        state = "tocked";   //  установить текущее состояние
                            //  после такта "ток"
    }
}
