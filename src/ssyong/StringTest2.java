package ssyong;

import java.util.Scanner;

public class StringTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문장입력: ");
        String str = sc.nextLine();

        System.out.println("입력받은 문장: " + str);

        System.out.print("역으로 출력: ");

        for (int i = str.length()-1; i >= 0; i--){
            System.out.println(str.charAt(i));
        }

        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.print("sb = " + sb);




    }
}
