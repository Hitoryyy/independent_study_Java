package Data_Input_Output.AVG;

/*  Данная программа находит среднее арифметическое для
 ряда чисел, введённых пользователем с клавиатуры. */

import java.io.*;

class AvgNums {
    public static void main(String[] args) throws IOException {
        //  создать объект типа BufferedReader,
        //  использующий поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum = 0.0;
        double avg, t;

        System.out.print("Сколько чисел вы введёте: ");
        str = br.readLine();
        try {
            n = Integer.parseInt(str);
        }
        catch (NumberFormatException exc) {
            System.out.println("Неверный формат");
            n = 0;
        }

        System.out.println("Ввод " + n + " значений");
        for (int i = 0; i < n; i++) {
            System.out.print(": ");
            str = br.readLine();
            try {
                t = Double.parseDouble(str);
            } catch (NumberFormatException exc) {
                System.out.println("Неверный формат");
                t = 0.0;
            }
            sum += t;
        }
        avg = sum / n;
        System.out.println("Среднее значение: " + avg);
    }
}
