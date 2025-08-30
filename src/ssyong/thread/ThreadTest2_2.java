package ssyong.thread;

public class ThreadTest2_2 {

    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
