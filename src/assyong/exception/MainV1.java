package assyong.exception;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
        NetworkServiceV1 networkServiceV1 = new NetworkServiceV1();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("전송할 문자: ");
            String userInput = sc.nextLine();
            if (userInput.equals("exit")){
                break;
            }
            networkServiceV1.sendMessage(userInput);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
