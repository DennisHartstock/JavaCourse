package com.example.lib.test;

import com.example.lib.oop.Person;

public class Main {

    public static void main(String[] args) {
//        String s = "10";
//        String s1 = "20";
//        int x = Integer.parseInt(s);
//        int y = Integer.parseInt(s1);

//        System.out.println(x + y);

        String s = "This is John. He is 27 years old.";
        String name = s.substring(8, 12);
        int age = Integer.parseInt(s.substring(20, 22));
        Person person = new Person(name, age);
        System.out.println(person.getName() + "\n" + person.getAge());
    }
}