package Data_Input_Output.Exercize_2;

//  Демонстрация работы справочной системы на основе файла
class FileHelp {
    public static void main(String[] args) {
        Help hlpobj = new Help("helpfile.txt");
        String topic;

        System.out.println("Воспользуйтесь справочной системой.\n" + "Для выхода из системы введите 'stop'.");

        do {
            topic = hlpobj.getSelection();

            if (!hlpobj.helpon(topic))
                System.out.println("Тема на найдена. \n");

        } while (topic.compareTo("stop") != 0);
    }
}
