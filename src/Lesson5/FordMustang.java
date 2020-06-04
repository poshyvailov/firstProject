package Lesson5;

public class FordMustang extends Car {   // Создали метод - FordMustang,который наследуется от метода Car.

    public int price;     // Создали дополнительную переменную для класса FordMustang
    public String color;  // Создали дополнительную переменную для класса FordMustang


    public FordMustang(String name, int countOfSeats,int price, String color){  // Создаем конструктор который принимает параметры name и countOfSeats, которые наследуются с класса  Car
        this.name = name;                                                       // Также в этом конструкторе мы используем переменные которые мы создали в нашем доченем классе FordMustang (переменные price и color)
        this.countOfSeats = countOfSeats;
        this.price = price;
        this.color = color;
    }


    public void fordInfo(){   // Создаем метод,который будет выводить имя машины, количество мест, цену и цвет. В этом методе мы используем как поля из родительского метода (Car) так и из дочернего (FordMustang)
        System.out.println("Name of the car is " + name + " Count of seats is: " + countOfSeats + " The price of the car is: " + price + " Color of the car is: " + color );
    }

}
