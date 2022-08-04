package Data_Input_Output.SF_1;

/* В этой версии программы те её части, которые отвечают
    за открытие файла и получение доступа к нему, помещены
    в один блок try. Файл закрывается в блоке finally.
 */

import java.io.*;

class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        //  Прежде всего необходимо убедиться в том, что программе
        //  передаётся имя файла
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        //  Открытие файла, чтение из него символов, пока
        //  не встретится признак конца файла EOF, и
        //  последующее закрытие файла в блоке finally
        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if (i != 1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("ошибка ввода-вывода" + exc);
        } finally {
            //  Файл закрывается в любом случае
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии файла");
            }
        }
    }
}
