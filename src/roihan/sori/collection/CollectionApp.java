package roihan.sori.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String>  collection = new ArrayList<>();

        collection.add("Roihan");
        collection.add("Sori");
        collection.addAll(List.of("Belajar", "Java", "Dasar"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println("Remove");

        collection.remove("Roihan");
        collection.removeAll(List.of("Belajar", "Dasar"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println(collection.contains("Sori"));

        System.out.println(collection.containsAll(List.of("Sori", "Java")));
    }
}
