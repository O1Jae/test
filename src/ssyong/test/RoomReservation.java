package ssyong.test;

import java.util.HashMap;

public interface RoomReservation{
        HashMap<Integer, Boolean> room = new HashMap<>();
        void roomReservation();          //예약
        void cancelReservation();        //취소
        void initFull(String roomFull);  //방 초기화
        void printRoom();
}
