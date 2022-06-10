package Introduction_To_Classes_Objects_And_Methods.Par;

public class ParDemo {

    public static void main(String[] args) {
        ChkNum e = new ChkNum();

        if (e.isEven(10)) {
            System.out.println("10 - чётное число");
        }

        if (e.isEven(9)) {
            System.out.println("9 - чётное число");
        }

        if (e.isEven(8)) {
            System.out.println("8 - чётное число");
        }
    }
}
