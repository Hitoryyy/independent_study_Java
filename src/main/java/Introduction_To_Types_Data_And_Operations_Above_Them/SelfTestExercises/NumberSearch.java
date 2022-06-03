package Introduction_To_Types_Data_And_Operations_Above_Them.SelfTestExercises;

public class NumberSearch {
    public static void main(String[] args) {

        int i, j;
        boolean isprime;

        for (i = 2; i < 100; i++) {
            isprime = true;

            //Проверить, делится ли число без остатка
            for (j = 2; j <= i/j; j++) {
                //если число делится без остатка, значит, оно не простое
                if ((i % j) == 0) isprime = false;

                if (isprime == false) {
                    System.out.println(i + " - простое число.");
                }
            }
        }
    }
}
