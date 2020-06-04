package Lesson5Animals;

public class Dog extends Animal {


    public Dog(String name, int age) {
        super(name, age);
    }


    @Override
    public String toString(){
        return "My name is: " + name + " and my age is: " + age;

    }


}
