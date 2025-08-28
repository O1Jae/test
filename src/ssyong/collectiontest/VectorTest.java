package ssyong.collectiontest;

import java.util.*;
public class VectorTest {

    public static void main(String[] args) {
        Vector v = new Vector(4,3); //기본공간 4개 부족하면 3개 증가
        System.out.println("현재 vector의 크기: " + v.capacity());
        System.out.println("v객체의 저장된 데이터 개수: " + v.size());

        /*
        * 기본 배열                 |컬렉션
        * 기본 자료형 및 레파란스를 저장  | 레퍼런스만 저장 (객체)
        * 고정                        | 가변 크기
        * 동종의 데이터만              |타종간의 데이터
        * */
        for(int i = 1; i <= 9; i++){
            //v.add(new Integer(i));
            v.add(i);//autoBoxing
        }
        System.out.println("현재 vector의 크기: " + v.capacity());
        System.out.println("v객체의 저장된 데이터 개수: " + v.size());

        v.add(3.14);
        v.add(2.45);
        v.add("hello");

        System.out.println("현재 vector의 크기: " + v.capacity());
        System.out.println("v객체의 저장된 데이터 개수: " + v.size());

        System.out.println("v의 2번 인덱스의 값: " + v.get(2));
        System.out.println("v의 12 번째 인덱스의 값: " + v.get(11));

        int tmp = (Integer) v.get(5); //unboxing
        System.out.println("tmp = " + tmp);
    }
}
