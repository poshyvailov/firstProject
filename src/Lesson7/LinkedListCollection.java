package Lesson7;

import java.util.LinkedList;

public class LinkedListCollection {

    public static void main(String[] args) {

        LinkedList<Integer>myCollection = new LinkedList<>();  // Создали новую коллекцию (LinkedList) которая принимет тип Integer

        for (int a = 0; a < 6; a++){       // Создается цикл,который наполняет нашу коллекцию значениями от 0 до 5
            myCollection.add(a);
        }

        for (Integer collection : myCollection){   //создали цикл for each где мы поочередно выводим все значения с нашей коллекции
            System.out.println(collection);        // Integer - это тип значений. collection - наша переменная для вывода значения с коллекции
                                                   // myCollection - коллекция,котроую мы будем обрабатывать
        }

        myCollection.remove(3);              // Удаляем элемент под индексом "3" (он же и хранит значение "3" которое мы просвоили этому индексу)из нашей коллекции

        System.out.println(myCollection);          //Выводим значения нашей коллекции и видим,что удалилось значение под номером "3".





    }
}
