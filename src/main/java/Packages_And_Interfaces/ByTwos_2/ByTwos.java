package Packages_And_Interfaces.ByTwos_2;

//  Использование интерфейсных ссылок
public class ByTwos implements Serise {
    int start;
    int val;

    ByTwos() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        start = 0;
        val = 0;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }


}
