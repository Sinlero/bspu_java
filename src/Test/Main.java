package Test;

import Task3.ArrayListOfStrings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayListOfStrings array = new ArrayListOfStrings(6);
        array.addElem("hello");
        for (int i = 0; i < array.getSize(); i++) {
            System.out.println(array.getElem(i));
        }
    }
}
