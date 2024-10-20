package roihan.sori.generic.application;

import roihan.sori.generic.MyData;

public class WildCardApp {
    public static void main(String[] args) {
        print(new MyData<>("roi"));
        print(new MyData<>(100));
        print(new MyData<MultipleConstrainApp.Manager>(new MultipleConstrainApp.Manager()));
    }

    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
