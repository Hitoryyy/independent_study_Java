package Exception_Handing.Exc_14;

//  Использование средства группового перехвата исключений.
//  Примечание: для компиляции этого кода требуется JDK 7
//  или более поздняя версия комплекта разработчика.
class MultiCatch {
    public static void main(String[] args) {
        int a = 88, b = 0;
        int result;
        char chrs[] = {'A', 'B', 'C'};

        for (int i = 0; i < 2; i++) {
            try {
                if (i == 0) {
                    //  Сгенерировать исключение ArithmeticException
                    result = a / b;
                } else {
                    //  Сгенерировать исключение ArrayIndexOutOfBoundsException
                    chrs[5] = 'X';
                }
            }
            //  В этом операторе catch организуется перехват
            //  обоих сообщений
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Перехваченное исключение");
            }
        }

        System.out.println("После группового перехватчика исключений");
    }
}
