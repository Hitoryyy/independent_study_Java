package Exception_Handing.Exc_12;

public class FinallyDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }
}
