package Lesson5Animals;

public class Animal {

    public String name;
    public int age;

    public static void main(String[] args) {
        Dog dog1 = new Dog("Body", 4);
        Cat cat1 = new Cat("Murzik", 3);

        System.out.println(dog1.toString());
        System.out.println(cat1.toString());

    }


    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "I am animal.";
    }
}
