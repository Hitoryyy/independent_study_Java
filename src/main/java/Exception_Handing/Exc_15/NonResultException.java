package Exception_Handing.Exc_15;

//  Использование специально создаваемого исключения

//  Создать исключение
class NonResultException extends Exception {
    int n;
    int d;

    NonResultException(int i, int j) {
        n = i;
        d = j;
    }

    public String toString() {
        return "Результат операции " + n + " / " + d + " не является целым числом";
    }
}
