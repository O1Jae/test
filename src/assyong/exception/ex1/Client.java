package assyong.exception.ex1;

public class Client {

    public void call()throws MyCheckedException {
        throw new MyCheckedException("ex");
    }
}
