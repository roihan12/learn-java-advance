package roihan.sori.generic.application;

import roihan.sori.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Roihan");
        process(stringMyData);
        MyData<? extends Object> myData = stringMyData;
    }

    public static void process(MyData<? extends Object> myData) {
        System.out.println(myData.getData());

//        myData.setData("Roi"); ERROE
    }
}
