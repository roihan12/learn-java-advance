package roihan.sori.generic.application;

import roihan.sori.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Roihan");
//        doit(stringMyData); ERROR
//        MyData<Object> objectMyData = stringMyData; //ERROR

        MyData<Object> objectMyData = new MyData<>(1000);
//        MyData<Integer> integerMyData = objectMyData;  //ERROR
//doItInteger(objectMyData);
    }

    public static void doit(MyData<Object> objectMyData) {

    }


    public static void doItInteger(MyData<Integer> integerMyData) {

    }
}
