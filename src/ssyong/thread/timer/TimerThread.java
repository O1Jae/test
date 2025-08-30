package ssyong.thread.timer;

import java.util.Calendar;
import java.util.Scanner;

class ClockThread extends Thread{

    @Override
    public void run(){

        while (true) {
            Calendar cal = Calendar.getInstance();

            int hour = cal.get(Calendar.HOUR_OF_DAY);
            int minute = cal.get(Calendar.MINUTE);
            int second = cal.get(Calendar.SECOND);

            System.out.println("\r"+hour + "시" + minute + "분" + second + "초");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
public class TimerThread {

    public static void main(String[] args) {
        ClockThread clockThread = new ClockThread();
        clockThread.start();
    }
}
