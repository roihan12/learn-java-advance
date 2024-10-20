package roihan.sori.generic.application;

import roihan.sori.generic.MultipleGeneric;

public class MultipleGenericApp {
    public static void main(String[] args) {
        MultipleGeneric<String, Integer> multipleGeneric = new MultipleGeneric<String, Integer>("Roihan", 100);

        System.out.println(multipleGeneric.getFirst());
        System.out.println(multipleGeneric.getSecond());
    }
}
