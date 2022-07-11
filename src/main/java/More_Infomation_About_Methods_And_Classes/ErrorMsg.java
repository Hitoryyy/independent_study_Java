package More_Infomation_About_Methods_And_Classes;

// Возврат объекта типа String
public class ErrorMsg {
    String msgs[] = {
        "Ошибка вывода", "Ошибка ввода", "Отсутствует место на диске", "Выход индекса за границы диапазонв"
    };

    String getErrorMsg(int i) {
        if (i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Несуществующий код ошибки";
    }
}

class ErrMsg {
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(19));
    }
}
