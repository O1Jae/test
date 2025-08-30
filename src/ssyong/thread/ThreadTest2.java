package ssyong.thread;

class Thread2 implements Runnable{

    @Override
    public void run() {
        for(int i = 1; i <= 9; i++){
            System.out.print(9*i + " ");
        }
    }
}
class Thread1 extends Thread{

    @Override
    public void run(){
        for(int i = 1; i <= 9; i++){
            System.out.print(6*i + " ");
        }
    }
}
public class ThreadTest2 {

    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++){
            System.out.print(3*i + " ");
        }

        Thread1 t1 = new Thread1();
        t1.start();
        Thread2 t2 = new Thread2();
        Thread tM = new Thread(t2);
        tM.start();
    }
}
