package roihan.sori.collection;

import roihan.sori.collection.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Roihan");

        person.addHobby("Game");
        person.addHobby("Coding");

        doSommthingWithHobbies(person.getHobbies());

        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }


    }

    public static void doSommthingWithHobbies(List<String> hobbies) {
        hobbies.add("Test");
    }
}
