package Introduction_To_Classes_Objects_And_Methods.Par;

// Простой пример применения параметра в методе

public class ChkNum {
    // вернуть логическое значение true,
    // если x содержит чётное число
    boolean isEven(int x) {
        if ((x % 2) == 0) {
            return true;
        }
        return false;
    }
}
