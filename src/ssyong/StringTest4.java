package ssyong;
import java.util.*;
public class StringTest4 {
    public static void main(String[] args) {
        String str = "사과, 배, 포도, 딸기, 수박";
        System.out.println("str = " + str);

        String fruits[] = str.split(",");

        for(int i = 0; i < fruits.length; i++){
            System.out.println("fruits[i]" + fruits[i]);
        }
        System.out.println("=======================");
        StringTokenizer st = new StringTokenizer(str,",");

        while (st.hasMoreElements()){
            System.out.println(st.nextElement());
        }

        String str2 = "오늘은 수요일 점심시간 지나고 배가 부르면서 잠이 온다";
        StringTokenizer st2 = new StringTokenizer(str2);
        while (st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }
    }
}
