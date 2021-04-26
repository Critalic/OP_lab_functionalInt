package com.Task2;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Human> people = new ArrayList<>();
        Human petro = new Human("Petro", 34,  "NAU");
        Student pedro = new Student();
        Student serhiy = new Student("Serhiy", 18, "LNU");
        Student nobody = null;

        people.add(serhiy);
        people.add(pedro);
        people.add(petro);
        people.add(nobody);

        people.forEach((s) -> System.out.println(s));
//        people.forEach(System.out :: println);
    }
}

