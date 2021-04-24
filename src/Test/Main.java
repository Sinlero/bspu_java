package Test;

import Task3.ArrayListOfStrings;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayListOfStrings arrayListOfStrings = new ArrayListOfStrings(2);
        arrayListOfStrings.addElem("Hello");
        arrayListOfStrings.addElem("Hello");
        arrayListOfStrings.addElem("Hello");
        for (int i = 0; i < arrayListOfStrings.getSize()-1; i++) {
            System.out.println(arrayListOfStrings.getElem(i));
        }
    }
}
