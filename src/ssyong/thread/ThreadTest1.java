package ssyong.thread;

class ThreadA extends Thread{

    @Override
    public void run() {

        Thread temp = Thread.currentThread();
        System.out.println("##ThreadA의 temp: "+temp+"##");
        System.out.println("##ThreadA의 시작##");
        for (int i = 1; i <= 10; i++){
            System.out.println("##ThreadA의 값: " + i + "##");
        }
        System.out.println("##ThreadA의 끝##");
    }
}
class ThreadB implements Runnable{

    @Override
    public void run() {

        Thread temp = Thread.currentThread();
        System.out.println("**ThreadB의 temp: "+temp+"**");
        System.out.println("**ThreadB의 시작**");

        for (int i = 1; i <= 10; i++){
            System.out.println("**ThreadB의 값: " + i + "**");
        }

        System.out.println("**ThreadB의 끝**");

    }
}
public class ThreadTest1 {

    public static void main(String[] args) {

        ThreadA ta = new ThreadA();
        ThreadB tb = new ThreadB();
        Thread tc = new Thread(tb);
        tc.start();
        ta.start();

        try {
            ta.join();
            tc.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        Thread.yield();
//        ta.setPriority(Thread.MAX_PRIORITY);
//        tc.setPriority(Thread.MIN_PRIORITY);
//        ta.setName("ThreadA");
//        System.out.println("ta객체의 스레드 이름: " + ta.getName());
//        System.out.println("현재 돌고있는 스레드: " + Thread.activeCount());
        System.out.println("==main의 시작==");

        for (int i = 1; i <= 10; i++){
            System.out.println("==main의 값: " + i + "==");
        }

        System.out.println("==main의 끝==");
    }
}
