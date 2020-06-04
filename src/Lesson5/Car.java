package Lesson5;

// Родительский/общий класс для всех машин. Имеет общие переменные name и countOfSeats

public class Car {

    public String name;
    public int countOfSeats;

    
   public Car (){  // Базовый конструктор
    }

   public Car (String name, int countOfSeats){  // Конструктор для создания экземпляра класса Car с полями name и countOfSeats
       this.name = name;
       this.countOfSeats = countOfSeats;
   }



    public void carInfo(){     // Метод в котором мы выводим имя объекта Car и количество мест в авто - countOfSeats
        System.out.println("Name of the car is: " + name + " Count of seats is: " + countOfSeats );
    }

}
