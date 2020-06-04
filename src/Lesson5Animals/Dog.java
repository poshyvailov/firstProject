package Lesson5Animals;

public class Dog extends Animal {  // Создали класс Dog который наследуется от класса Animal


    public Dog(String name, int age) {    // Создали конструктуор класса Dog, который инициализирует поля name и age
        super(name, age);
    }


    @Override
    public String toString(){    // переопределили метод toString. Теперь он будет выводить данные экземпляра класса
        return "I am dog with name: " + name + " with age: " + age;

    }


}
