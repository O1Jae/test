package ssyong.collectiontest;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hello");
        arr.add("java");
        arr.add("jsp");

        for(int i = 0; i < arr.size(); i++){
            String tmp = arr.get(i);
            System.out.println(tmp);
        }
    }
}
