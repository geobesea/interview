package com.exercises.interview.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExercise {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 20),
                new Person("Bob", 17),
                new Person("Charlie", 25),
                new Person("Diana", 15)
        );

        List<String> result = new ArrayList<>();
        for (Person person : people) {
            if (person.getAge() > 18) {
                result.add(person.getName() + " - " + person.getAge());
            }
        }

        // TODO - use stream instead of for loop


        System.out.println(result);
    }
}
