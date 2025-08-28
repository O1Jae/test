package ssyong.collectiontest;

import java.util.*;

public class VectorTest2 {
    public static void main(String[] args) {
        Vector v = new Vector();

        System.out.println("v의 크기: " + v.capacity());
        System.out.println("v의 저장된 데이터 수: " + v.size());

        //  v.add(new Integer(10));
        v.add(20);
        //v.add(new Double(30.3));
        v.add(40.4);
        v.add("java");
        v.add("jsp");

        System.out.println("v의 1번째 데이터: " + v.get(0));
        System.out.println("v의 3번째 데이터: " + v.get(2));
        System.out.println("v의 5번째 데이터: " + v.get(3));

        int in  = (Integer) v.get(0);
        //int in = Integer.parseInt(((Integer)v.get(1)).toString());
        System.out.println("in = " + in);

        Vector<Integer> v2 =  new Vector<Integer>();
        //v.add()
        v2.add(30);
        v2.add(50);
        v2.add(70);
        v2.add(90);

        for(int i = 0; i < v2.size();i++){
            Integer temp = v2.get(i);
            System.out.println(temp);
        }
    }
}
