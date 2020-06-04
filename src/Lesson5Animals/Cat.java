package Lesson5Animals;

public class Cat extends Animal{  // Создали класс Cat который наследуется от класса Animal


    public Cat(String name, int age) {  // Создали конструктуор класса Cat, который инициализирует поля name и age
        super(name, age);
    }


    @Override
    public String toString(){   //  переопределили метод toString. Теперь он будет выводить данные экземпляра класса
        return "My name is: " + name + " and my age is: " + age;
    }


}
