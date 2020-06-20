package Lesson8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainForMap {

    public static void main(String[] args) {

        HashMap<Integer, Student> studentsList = new HashMap<>();


        studentsList.put(43823752, new Student("Aleksandr"));
        studentsList.put(23421214, new Student("Oleg"));
        studentsList.put(45745744, new Student("Aleksey"));
        studentsList.put(23424422, new Student("Artem"));


        Set <Map.Entry<Integer,Student>>entries=studentsList.entrySet();
        for(Map.Entry<Integer,Student> me : entries){
            System.out.print("Passport id is: " + me.getKey() + ":" + " ");
            System.out.println(me.getValue());
        }


        System.out.println(studentsList.get(45745744));

    }
}

