package roihan.sori.generic.application;

import roihan.sori.generic.MyData;

public class GenecricClassApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("Roihan");
        MyData<Integer> integerMyData = new MyData<>(100);

        System.out.println(stringMyData.getData());
        System.out.println(integerMyData.getData());
    }
}
