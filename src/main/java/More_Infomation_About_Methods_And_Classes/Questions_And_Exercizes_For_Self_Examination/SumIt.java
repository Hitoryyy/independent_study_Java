package More_Infomation_About_Methods_And_Classes.Questions_And_Exercizes_For_Self_Examination;

public class SumIt {
    int sum(int ... n) {
        int result = 0;
        for (int i = 0; i < n.length; i++) {
            result += n[i];
        }
        return result;
    }
}

class SumDemo {
    public static void main(String[] args) {
        SumIt siObj = new SumIt();

        int total = siObj.sum(1,2,3);
        System.out.println("Сумма: " + total);

        total = siObj.sum(1,2,3,4,5);
        System.out.println("Сумма: " + total);
    }
}
