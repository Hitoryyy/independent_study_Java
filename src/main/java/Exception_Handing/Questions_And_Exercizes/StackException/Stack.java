package Exception_Handing.Questions_And_Exercizes.StackException;

//  Класс, реализующий стек для хранения символов
class Stack {
    private char stck[];    //  массив для хранения элементов стека
    private int tos;        //  вершина стека

    //  Создать пустой стек заданного размера
    Stack(int size) {
        stck = new char[size];
        tos = 0;
    }

    //  Создать один стек из другого стека
    Stack(Stack ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];

        //  копировать элементы
        for (int i = 0; i < tos; i++){
            stck[i] = ob.stck[i];
        }
    }

    //  Создать стек с начальными значениями
    Stack(char a []) {
        stck = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            try {
                push(a[i]);
            }
            catch (StackFullException exc) {
                System.out.println(exc);
            }
        }
    }

    //  Поместить символы в стек
    void push(char ch) throws StackFullException {
        if (tos == stck.length) {
            throw new StackFullException(stck.length);
        }
        stck[tos] = ch;
        tos++;
    }

    //  Извлечь символы из стека
    char pop() throws StackEmptyException {
        if (tos == 0) {
            throw new StackEmptyException();
        }
        tos--;
        return stck[tos];
    }
}
