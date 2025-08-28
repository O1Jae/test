package ssyong.stringapi;

import java.util.Arrays;
import java.util.Scanner;

public class SujjestString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String[] search = {"관련 키워드","자바 첫걸음","자바그까이꺼","java 참 쉬워요",
                "java 진짜는 어려워요","jsp 첫걸음","jsp 초급부터 중급까지","자기소개서 작성","자우징장지징"};
        String s = Arrays.toString(search);
        for (int i = 0; i < search.length; i++){
            String result = String.valueOf(search[i]);
            System.out.println("result = " + result);
            if(result.startsWith(userInput)){
                System.out.println(result);
            }
        }

    }
}
//for (int i = 0; i < search.length; i++){
//            if (search[i].startsWith(userInput)){
//                System.out.println(search[i]);;
//            }
//        }