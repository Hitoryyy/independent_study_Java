package More_Infomation_About_Methods_And_Classes.Exercize_1;

// Усовершенствованный класс очереди, предназначенный
// для хранения символьных значений
public class Queue {
    // Эти члены класса теперь являются закрытыми
    private char q[]; // массив для хранения элементов очереди
    private int putloc, getloc; // индексы для вставки и
                                // извлечения элементов очереди

    Queue(int size) {
        q = new char[size];     // выделить память для очереди
        putloc = getloc = 0;
    }

    // Поместить символ в очередь
    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполнена.");
            return;
        }

        putloc++;
        q[putloc] = ch;
    }

    // Извлечь символ из очереди
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста.");
            return (char) 0;
        }

        getloc++;
        return q[getloc];
    }
}

class QDemo1 {
    public static void main(String[] args) {
        Queue test = new Queue(10);
        test.put('h');
        System.out.println(test.get());
    }
}
