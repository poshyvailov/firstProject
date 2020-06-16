package Lesson7;

import java.util.HashSet;

public class HashSetCollection {

    public static void main(String[] args) {

        HashSet<Integer> myHashSetCollection = new HashSet<>();  // Создаем HashSet коллекцию

        for(int a = 10; a <60; a+=10){    // Наполняем коллекцию значениями от 10 до 50
            myHashSetCollection.add(a);
        }

        System.out.println("Our HashSet collection contains next values: ");  // Выводим список значений из коллекции при помощи цикла for each
        for (Integer collection:myHashSetCollection) {                        // Видим что порядок добавления элементов непредсказуем. Насколько я понял,то это делается для ускорения выборки
            System.out.println(collection);
        }

        myHashSetCollection.remove(10);  // В HashSet коллекции ны не можем удалить элемент по индексу, поэтому удаляем по значению
        System.out.println("After removing element with value: 10, our HashSet collection contains next values:  "+ myHashSetCollection); // Видим, что удалился элемент со значением:10
    }
}
