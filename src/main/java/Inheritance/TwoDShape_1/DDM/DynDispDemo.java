package Inheritance.TwoDShape_1.DDM;

public class DynDispDemo {
    public static void main(String[] args) {
        Sup superOb = new Sup();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();

        Sup supRf;

        supRf = superOb;
        supRf.who();

        supRf = subOb1;
        supRf.who();

        supRf = subOb2;
        supRf.who();
    }
}
