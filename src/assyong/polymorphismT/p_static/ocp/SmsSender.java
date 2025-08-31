package assyong.polymorphismT.p_static.ocp;

public class SmsSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS 발송합니다:" + message);
    }
}
