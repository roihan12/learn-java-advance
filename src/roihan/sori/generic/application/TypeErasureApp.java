package roihan.sori.generic.application;

import roihan.sori.generic.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {
        MyData myData = new MyData("Roi");

        MyData<Integer> integerMyData = (MyData<Integer>)  myData;
        Integer integer = integerMyData.getData();

    }
}
