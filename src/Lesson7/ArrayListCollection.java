package Lesson7;

import java.util.ArrayList;

public class ArrayListCollection {

    public static void main(String[] args) {

        ArrayList<Integer>myArrayListCollection = new ArrayList<>();

        for(int a = 0; a <= 5; a++){
            myArrayListCollection.add(a);
        }

        System.out.println("Our ArrayList collection contains next values: ");
        for (Integer collection : myArrayListCollection) {
            System.out.println(collection);
        }

        myArrayListCollection.remove(3);
        System.out.println("After removing element with index -3 our ArrayList collections contains next values: " + myArrayListCollection);

    }
}
