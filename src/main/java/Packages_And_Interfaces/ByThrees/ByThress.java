package Packages_And_Interfaces.ByThrees;

//  Ещё одна реализация интерфейса Series
public class ByThress implements Series {
    int start;
    int val;

    ByThress() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 3;
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
