package roihan.sori.generic.application;

import roihan.sori.generic.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Roihan", "Bogor"),
                new Person("Roihan 1", "Bogor 1"),
                new Person("Roihan 2", "Bogor 2"),
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
