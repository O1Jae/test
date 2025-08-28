package ssyong.collectiontest;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("apple","사과");
        map.put("plate","접시");
        map.put("one","하나");
        map.put("two","둘");

        System.out.println("apple은 뭐니: " + map.get("apple"));
        System.out.println("one 뭐니: " + map.get("one"));

        map.put("apple","아이폰");

        System.out.println("apple은 뭐니: " + map.get("apple"));

        Iterator<String> keys = map.keySet().iterator();//중요 key 값 찾기

        while (keys.hasNext()){
            String key = keys.next();
            String value = map.get(key);
            System.out.println("key = " + key + " value = " + value);
        }

        for(String key: map.keySet()){
            System.out.println("키: " + key);
        }
    }
}
