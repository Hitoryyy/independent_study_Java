package Packages_And_Interfaces.Questions_And_Exercise.qpack;

//  Интерфейс для очереди символов
public interface ICharQ {
    //  Поместить символ в очередь
    void put(char ch);

    //  Извлечь символ из очереди
    char get();
}
