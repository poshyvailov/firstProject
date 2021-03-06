package Lesson7;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.LinkedList;

public class LinkedListCollection {

    public static void main(String[] args) {

        LinkedList<Integer>myCollection = new LinkedList<>();  // Создали новую коллекцию (LinkedList) которая принимет тип Integer

        for (int a = 10; a < 60; a+=10){       // Создается цикл,который наполняет нашу коллекцию значениями от 10 до 50
            myCollection.add(a);
        }

        System.out.println("Our LinkedList collection contains next values: ");
        for (Integer collection : myCollection){   //Создали цикл for each где мы поочередно выводим все значения с нашей коллекции
            System.out.println(collection);        // Integer - это тип значений. collection - наша переменная для вывода значений с коллекции
                                                   // myCollection - коллекция,котроую мы будем обрабатывать
        }

        myCollection.remove(3);              // Удаляем элемент под индексом "3" (он хранит значение "40" которое мы присвоили этому индексу) из нашей коллекции

        System.out.println("After removing element with index - 3 our LinkedListcollection contains next values: "+ myCollection );   //Выводим значения нашей коллекции и видим,что удалился элемент под индектом:"3", который хранил значение:"40".

        System.out.println();
        System.out.println("Теперь под индексом - 3 хранится эелемент со значением: " + myCollection.get(3));  // Проверям какое значение теперь хранится под индексом 3





    }
}
