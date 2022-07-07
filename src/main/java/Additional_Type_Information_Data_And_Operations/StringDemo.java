package Additional_Type_Information_Data_And_Operations;

// Знакомство с классом String
public class StringDemo {
    public static void main(String[] args) {
        // Различные способы объявления строк
        String str1 = new String("В Java строки - объекты.");
        String str2 = "Их можно создавать разными способами.";
        String str3 = new String(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
