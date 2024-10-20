package roihan.sori.generic.application;

import roihan.sori.generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Roihan", "Sori"};
        Integer[] numbers = {1,2,4,5,};

        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.count(numbers));

    }
}
