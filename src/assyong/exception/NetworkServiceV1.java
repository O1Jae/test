package assyong.exception;

public class NetworkServiceV1 {

    public void sendMessage(String data){
        NetworkClientV1 client = new NetworkClientV1("http://naver.com");
        client.initError(data);

        String connectResult = client.connect();
        if (isError(connectResult)){
            System.out.println("[네트워크 오류 발생] 오류코드" + connectResult);
        }else{
            String sendResult = client.send(data);
            if (isError(sendResult)){
                System.out.println("[네트워크 오류 발생] 오류코드" + sendResult);
            }
        }
        client.disconnect();
    }

    public static boolean isError(String resultCode){
        return !resultCode.equals("success");
    }
}
