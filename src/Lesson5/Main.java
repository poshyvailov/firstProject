package Lesson5;

// Наследование полезно если мы будем переиспользовать какие-то поля или методы в других классах, чтобы каждый раз не переписывать их заново
// В этом примере есть родительский класс Car поля и методы которого будут использоваться в классе FordMustang. И дочерний класс FordMustang который имеет свои,дополнительные поля



public class Main {  // Создали базовый класс

    public static void main(String[] args) {

        Car car1 = new Car("Audi", 2);  // Создаем объект класса Car, используя конструктор, инициализируем  поля name и countOfSeats
        car1.carInfo();                                   // Вызываем метод carInfo из класса Car

        FordMustang ford = new FordMustang("Ford", 2, 25000, "Black");  // Создаем объект класса FordMustang, используя конструктор, инициализируем  поля name, countOfSeats, price, color
        ford.fordInfo();

    }
}
