package Introduction_To_Classes_Objects_And_Methods;

class MyClass {

    // Простой конструктор

   /* int x;

    MyClass() {
        x = 10;
    }*/

    // Параметризированный конструктор

    int x;

    MyClass(int i) {
        x = i;
    }

}

class ConsDemo {

    public static void main(String[] args) {

       /* MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();

        System.out.println(t1.x + " " + t2.x);*/

        //------------------------------------------------------------------//

        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(88);

        System.out.println(t1.x + " " + t2.x);
    }
}
