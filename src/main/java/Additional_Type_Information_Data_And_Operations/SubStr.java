package Additional_Type_Information_Data_And_Operations;

// Применение метода substring()
public class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java - двигатель Интернета.";

        // Сформировать подстроку
        String substr = orgstr.substring(7, 26);

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
