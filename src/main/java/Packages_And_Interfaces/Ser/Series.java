package Packages_And_Interfaces.Ser;

//  Усовершенствованная версия интерфейса Series, которая включает
//  используемый по умолчанию метод getNextArray()
public interface Series {
    int getNext(); //   вернуть следующее число в ряду

    //  Возвратить массив, который содержит n элементов,
    //  распологающихся в ряду вслед за текущим элементом
    default int[] getNextArray(int n) {
        int[] vals = new int[n];

        for (int i = 0; i < n; i++) {
            vals[i] = getNext();
        }
        return vals;
    }

    void reset();   //  сброс
    void setStart(int x);   //  установка начального значения
}
