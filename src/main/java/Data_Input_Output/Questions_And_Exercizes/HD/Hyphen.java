package Data_Input_Output.Questions_And_Exercizes.HD;
/*  Копирование текстового файла с заменой пробелов дефисами.

    В этой версии программы используются байтовые потоки.

    Для того чтобы воспользоваться этой программой, укажите
    в командной строке имена исходного и целевого файлов. Например:

    java Hyphen source target
 */

import java.io.*;

class Hyphen {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        //  Сначала проверить, указаны ли имена обоих фалов
        if (args.length != 2) {
            System.out.println("использование: Hypen откуда куда");
            return;
        }

        //  Скопировать файл и заменить в нём пробелы дефисами
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                //  преобразовать пробел в дефис
                if ((char) i == ' ') i = '-';

                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии входного файла.");
            }

            try {
                if (fin != null) fout.close();
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии выходного файла.");
            }
        }
    }
}
