package Multithreading_Programming.Questions_And_Exercize;

//  Вариант класса TickTock, в которой введены вызовы
//  метода sleep() для организации отсчёта времени.

class TickTock {

    String state;   //  содержит состояние часов

    synchronized void tick(boolean running) {
        if (!running) { //  остановить часы
            state = "ticked";
            notify();   //  уведомить ожидающие потоки
            return;
        }

        System.out.println("Tick");

        //  ожидать полсекунды
        try {
            Thread.sleep(500);
        } catch (InterruptedException exc) {
            System.out.println("Выполнение потока прервано");
        }

        state = "ticked";   //  установить текущее состояние после такта "тик"

        notify();   //  разрешить выполнение метода tock()
        try {
            while (!state.equals("tocked")) {
                wait(); //  ожидать завершения метода tock()
            }
        } catch (InterruptedException exc) {
            System.out.println("Выполнение потока прервано");
        }
    }

    synchronized void tock(boolean running) {
        if (!running) { //  остановить часы
            state = "tocked";
            notify(); //    уведомить ожидающие потоки
            return;
        }

        System.out.println("Tock");

        //  ожидать полсекунды
        try {
            Thread.sleep(500);
        } catch (InterruptedException exc) {
            System.out.println("Выполнение потока прервано");
        }

        state = "tocked";   //  установить текущее состояние после такта "так"

        notify();   //  разрешить выполнение метода tick()
        try {
            while (!state.equals("ticked"))
                wait(); //  ожидать завершения метода tick()
        } catch (InterruptedException exc) {
            System.out.println("Выполнение потока прервано");
        }
    }
}
