package assyong.exception.ex1;

public class MyCheckedException extends Exception{
    //Exception 상속시 체크 예외
    public MyCheckedException(String message) {
        super(message);
    }
}
