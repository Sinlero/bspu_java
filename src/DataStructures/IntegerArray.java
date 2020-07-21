package DataStructures;

public class IntegerArray {
    private int[] array;
    int index = 0;

    IntegerArray() {
        array = new int[10];
    }

    IntegerArray(int size) {
        array = new int[size];
    }

    public int getSize() {
        return array.length;
    }

    public void add(int value) {
        if (index >= array.length) {
            array = copy();
        }
        array[index++] = value;
    }

    private int[] copy() {
        int[] copyArray = new int[array.length+10];
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }
        return copyArray;
    }

//    public void add(int index,int value) {
//        if (index >= getSize()) {
//            System.out.println("Index out of bounds");
//        } else {
//            array[index] = value;
//        }
//    }

    public int get(int index) {
        if (index >= getSize()) {
            System.out.println("Index out of bounds");
            return 0;
        } else {
            return array[index];
        }
    }
}
