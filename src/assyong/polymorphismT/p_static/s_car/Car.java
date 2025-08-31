package assyong.polymorphismT.p_static.s_car;

public class Car {

    String carName;
    static int count;
    public Car() {}

    public Car(String carName){
        this.carName = carName;
        System.out.println("차량 구입, 이름: " + carName);
        count++;
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량 수:" + count);
    }
}
