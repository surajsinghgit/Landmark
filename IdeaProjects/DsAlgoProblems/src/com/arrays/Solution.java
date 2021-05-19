package com.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person[]
                {new Person("M", "Suraj"),
                new Person("M", "Aman"),
                new Person("F", "Sarika"),
                new Person("F", "Babita")});

        new Solution().sortPersons(persons);

    }
    //F F or M M
    //F
    public  void sortPersons(List<Person> persons) {
        List<Person> sortedList;
        sortedList=persons.stream().sorted((o1,o2)->{
        if(o1.getGender().equals(o2.getGender())){
            return o1.getName().compareTo(o2.getName());
        }else if(o1.getGender().equals("F")){
            return -1;
        }else{
            return 1;
        }


        }).collect(Collectors.toList());
        System.out.println(sortedList.toString());
    }

    private static class Person {
        public String getName() {
            return name;
        }

        public Person(String gender, String name) {
            this.gender = gender;
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "gender='" + gender + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }

        private String gender;
        private String name;
    }
}
