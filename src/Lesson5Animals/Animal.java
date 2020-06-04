package Lesson5Animals;

public class Animal {   // Создали родительский класс Animal с публичными полями name и age

    public String name;
    public int age;

    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", 4);
        Cat cat1 = new Cat("Murzik", 3);

        System.out.println(dog1.toString());
        System.out.println(cat1.toString());

    }


    public Animal(String name, int age){   // Создали конструктор в котором задаются значения всех полей класса
        this.name = name;
        this.age = age;
    }

    public String toString(){       // Создали метод toString который по-умолчанию выводит текст "i am animal"
        return "I am animal.";
    }
}
