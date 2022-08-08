package Data_Input_Output.SF;

/*  Отображение текстового файла

    При вызове этой программы следует указать имя файла,
    содержимое которого требуется просмотреть.
    Например, для вывода на экран содержимого файла TEST.TXT
    необходимо ввести в командной строке следующую команду:

    java ShowFile TEST.TXT

 */

import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        //  Прежде всего необходимо убедиться в том, что программе
        //  передаётся имя файла
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException exc) {
            System.out.println("Файл не найден");
            return;
        }

        try {
            //  Читать байты, пока не встретится символ EOF
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Ошибка при чтении файла");
            //  Для закрытия файла используется блок finally
        } finally {
            //  Закрыть файл при выходе из блока try
            try {
                fin.close();
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии файла");
            }
        }
    }
}
