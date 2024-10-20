package roihan.sori.generic.application;

import roihan.sori.generic.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Roihan", "Bogor"),
                new Person("Roihan 1", "Bogor 1"),
                new Person("Roihan 2", "Bogor 2"),
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people, comparator);
        System.out.println(Arrays.toString(people));
    }
}
