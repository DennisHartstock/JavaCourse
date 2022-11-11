package com.example.lib.test;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<String> namesHashSet = new HashSet<>();
        namesHashSet.add("John");
        namesHashSet.add("Emma");
        namesHashSet.add("Alice");
        namesHashSet.add("Alice");
        namesHashSet.add("Tom");
        namesHashSet.add("Mickey");
        for (String name : namesHashSet) {
            System.out.println(name);
        }

//        ArrayList<String> names = new ArrayList<>();
//        names.add("Vita");
//        names.add("Lilli");
//        names.add("Dennis");
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//
//        ArrayList<String> personList = new ArrayList<>();
//        for (int i = 0; i < numbers.size(); i++) {
//            personList.add("Number: " + numbers.get(i) + "     Person: " + names.get(i));
//        }
//        for (String person : personList) {
//            System.out.println(person);
//        }


//        ArrayList<String> employees = getEmployees();
//        employees.add("Emma");
//        employees.remove("Donny");
//        employees.remove(0);
//        for (String employee : employees) {
//            System.out.println(employee);
//        }

//        ArrayList<Integer> numbers = new ArrayList<>();
//        for (int i = 0; i < 1000; i++) {
//            numbers.add(i);
//        }
//        for (int number : numbers) {
//            System.out.println(number);
//        }
    }
//
//    private static ArrayList<String> getEmployees() {
//        ArrayList<String> employees = new ArrayList<>();
//        employees.add("Nick");
//        employees.add("John");
//        employees.add("Richard");
//        employees.add("Michael");
//        employees.add("Donny");
//        return employees;
//    }
}