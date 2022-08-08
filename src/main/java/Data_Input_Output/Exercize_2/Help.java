package Data_Input_Output.Exercize_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Упражнение 10.2

    Справочная система, использующая дисковый файл
    для хранения информации
 */

/*  В классе FileHelp открывается файл со справочной информацией,
    производится поиск указанной темы, а затем отображается
    справочная информация. Обратите внимание на то, что данный
    класс обрабатывает все исключения, освобождая от этого
    вызывающий код.
 */
class Help {
    String helpfile;    //  имя файла, содержащего
                        //  справочную информацию

    Help(String fname) {
        fname = helpfile;
    }
    //  Отобразить справочную информацию по указанной теме
    boolean helpon(String what) {
        int ch;
        String topic, info;

        //  Открыть справочный файл
        try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))) {
            do {
                //  Читать символы до тех пор, пока не встретится символ #
                ch = helpRdr.read();
                //  Проверить, совпадают ли темы
                if (ch == '#') {
                    topic = helpRdr.readLine();
                    if (what.compareTo(topic) == 0) {   //  найти тему
                        do {
                            info = helpRdr.readLine();
                            if (info != null) System.out.println(info);
                        } while ((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while (ch != -1);
        }
        catch (IOException exc) {
            System.out.println("Ошибка при попытке доступа к файлу справки");
            return false;
        }
        return false;   //  тема не найдена
    }

    //  Получить тему справки
    String getSelection() {
        String topic = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Укажите тему: ");
        try {
            topic = br.readLine();
        }
        catch (IOException exc) {
            System.out.println("Ошибка при чтении с консоли");
        }
        return topic;
    }
}
