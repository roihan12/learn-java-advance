package roihan.sori.generic.application;

import roihan.sori.generic.MyData;

public class ContraVariantApp {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Roihan");
        objectMyData.setData(100);
        MyData<? super  String> myData = objectMyData;

        process(objectMyData);
        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String> myData) {
        String value = (String) myData.getData();
        System.out.println("Process parameter " + value);

        myData.setData("Roihan 2");
    }
}
