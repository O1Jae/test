package assyong.polymorphismT.p_static.ocp;

public class FaceBookSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("페이스북 발송합니다:" + message);
    }
}
