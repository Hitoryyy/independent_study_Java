package Exception_Handing.Questions_And_Exercizes.StackException;

//  Исключение, возникающее при обращении к пустому стеку
public class StackEmptyException extends Exception {
    public String toString() {
        return "\nСтек пуст.";
    }
}
