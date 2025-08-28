package ssyong.test;

import java.util.HashMap;
import java.util.Scanner;

public class HotelReservationM {
    //static HashMap<Integer,Boolean> room = new HashMap<Integer,Boolean>();
    public static void main(String[] args) {

//        room.put(101,false);
//        room.put(102,false);
//        room.put(103,false);
//        room.put(201,false);
//        room.put(202,false);
//        room.put(203,false);
//        room.put(301,false);
//        room.put(302,false);
//        room.put(303,false);
//        for (int i = 0; i < room.length; i++){
//            for(int j = 0; j < room[i].length; j++){
//                System.out.println(room[i][j]);
//            }
//        }
        RoomReservation rooms = new Users();
        rooms.initFull("MyHotel");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=====================");
            System.out.println("숙박예약관리프로그램v1.0");
            System.out.println("---------------------");
            System.out.println("1.방 예약하기");
            System.out.println("2.예약 취소하기");
            System.out.println("3.예약 현항보기");
            System.out.println("4.종료");
            System.out.println("=====================");
            System.out.println("메뉴>");

            int userInput = sc.nextInt();

            switch (userInput){
                case 1: rooms.roomReservation();
                break;
                case 2: rooms.cancelReservation();
                break;
                case 3: rooms.printRoom();
                break;
                case 4:
                    System.out.println("프로그램 종료");
                    return;
            }
        }
    }
}
