package Lesson7;

import java.util.ArrayList;

public class ArrayListCollection {

    public static void main(String[] args) {

        ArrayList<Integer>myArrayListCollection = new ArrayList<>();   // Создаем ArrayList коллекцию,которая будет принимать Integer

        for(int a = 10; a < 60; a+=10){     // Создаем цикл и наполняем коллекцию значениями от 10 до 50
            myArrayListCollection.add(a);
        }

        System.out.println("Our ArrayList collection contains next values: ");  // Выводим все значения с коллекции при помощи цикла for each
        for (Integer collection : myArrayListCollection) {
            System.out.println(collection);
        }

        myArrayListCollection.remove(3);  // Удаляем значение под индексом 3
        System.out.println("After removing element with index -3 our ArrayList collections contains next values: " + myArrayListCollection); // Проверяем какие значения остались в коллекции
        System.out.println(myArrayListCollection.get(3));  // Проверяем,что теперь под индексом: 3 хранится значение,которое раньше хранилось под индексом: 4

    }
}
