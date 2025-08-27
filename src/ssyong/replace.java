package ssyong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class replace {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("문자를 입력하시오: ");
        String userInput = br.readLine();
        char foundNum = (char)br.read();
        int count = 0;
        for(int i = 0; i < userInput.length(); i++){
            char temp = userInput.charAt(i);
            if(temp == foundNum){
                count++;
            }
        }
        System.out.println("찾은 갯 수 :" + count);
    }
}
