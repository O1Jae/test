package ssyong.thread;
class ThreadAA extends Thread{

    @Override
    public void run(){
        System.out.println("##ThreadAA의 시작##");

        for(int i = 1; i <= 100; i++){
            System.out.println("##ThreadAA의 값: " + i +"##");
        }
        System.out.println("##ThreadAA의 끝##");
    }
}
public class ThreadDaemon {

    public static void main(String[] args) {

        ThreadAA taa = new ThreadAA();
        taa.setDaemon(true);
        taa.start();
        System.out.println("taa너 종속 쓰레드니?:" + taa.isDaemon());
        System.out.println("==main의 시작==");

        for(int i = 1; i <= 10; i++){
            System.out.println("==main의 값: " + i +"==");
        }
        System.out.println("==main의 끝==");


    }
}
