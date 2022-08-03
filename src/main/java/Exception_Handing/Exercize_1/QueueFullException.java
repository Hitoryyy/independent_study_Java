package Exception_Handing.Exercize_1;

//  Исключение, указывающее на переполнение очереди
public class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) {
        size = s;
    }

    public String toString() {
        return "\n Очередь заполнена. Максимальный размер очереди: " + size;
    }
}
