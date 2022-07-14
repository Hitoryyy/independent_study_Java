package More_Infomation_About_Methods_And_Classes.Questions_And_Exercizes_For_Self_Examination;

// Swap для объектов
public class Test {
    int a;

    Test (int i) {
        a = i;
    }

    void swap (Test ob1, Test ob2) {
        int t;

        t = ob1.a;
        ob1.a = ob2.a;
        ob2.a = t;
    }
}
