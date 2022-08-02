package Exception_Handing.Exercize_1;

//  Исключение, указывающее на исчерпание очереди
public class QueueEmptyException extends Exception{
    public String toString() {
        return "\n Очередь пуста";
    }
}
