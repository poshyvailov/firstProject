package Lesson7;

import java.util.HashSet;

public class HashSetCollection {

    public static void main(String[] args) {

        HashSet<Integer> myHashSetCollection = new HashSet<>();

        for(int a = 0; a <=5; a++){
            myHashSetCollection.add(a);
        }

        System.out.println("Our HashSet collection contains next values: ");
        for (Integer collection:myHashSetCollection) {
            System.out.println(collection);
        }

        myHashSetCollection.remove(3);
        System.out.println("After removing element with index - 3, our HashSet collection contains next values:  "+ myHashSetCollection);
    }
}
