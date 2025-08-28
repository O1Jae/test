package ssyong.test;

import java.util.*;

public class Users implements RoomReservation{

    private int roomNum;

    public Users() {}

    Scanner sc = new Scanner(System.in);

    @Override
    public void roomReservation() {
        System.out.println("==방 예약하기==");
        System.out.print("방 번호: ");

        int roomNum = sc.nextInt();

        Boolean reserved = RoomReservation.room.get(roomNum);
        System.out.println("reserved = " + reserved);
        if (reserved) {
            System.out.println(roomNum + "호는 이미 예약된 방입니다.");
            return;
        }

        RoomReservation.room.put(roomNum, true);
        System.out.println(roomNum + "호 예약 완료");
    }

    public void cancelReservation() {
        System.out.println("== 방 예약 취소하기 ==");
        System.out.print("방 번호: ");

        int roomNum = sc.nextInt();
        Boolean reserved = RoomReservation.room.get(roomNum);

        if (!reserved) {
            System.out.println(roomNum + "호는 이미 비어 있습니다.");
            return;
        }

        RoomReservation.room.put(roomNum, false);
        System.out.println(roomNum + "호 예약 취소 완료!");
    }

    @Override
    public void initFull(String myHotel) {
        int[] roomNums = {101,102,103,201,202,203,301,302,303};
        for(int i = 0; i < roomNums.length; i++){
            RoomReservation.room.put(roomNums[i],false);
        }
    }

    @Override
    public void printRoom() {

        Iterator<Integer> roomK = room.keySet().iterator();

        while (roomK.hasNext()){
            Integer rk = roomK.next();
            //System.out.println("rk = " + rk);
            Boolean va = room.get(rk);
            if (room.get(rk) == false) {
                System.out.println(rk+"호: " + "빈방");
            } else if (room.get(rk) == true) {
                System.out.println(rk +"호: " +  "예약됨");
            }
        }
//        for (Integer key:room.keySet()){
//            System.out.println(key+"호:  ");
//        }
    }
}
