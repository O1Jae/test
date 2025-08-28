package ssyong.stringapi;

import java.util.Scanner;

public class MaskingProg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] badWord = {"바보","멍청이","똥개","말미잘","그지","해삼"};
        System.out.println("메시지 입력: ");
        String userInput = sc.nextLine();
        for (int i =0; i < badWord.length; i++){
            String temp ="";
            for (int j = 0; j < badWord[i].length();j++){
                temp+="*";
            }
            userInput = userInput.replace(badWord[i],temp);
        }
        System.out.println("출력된 메시지: " + userInput);

    }
}
