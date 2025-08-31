package assyong.polymorphismT.p_static;

import assyong.polymorphismT.p_static.s_car.Car;

public class Sta_CarMain {

    public static void main(String[] args) {
        Car ca1 = new Car("K3");
        Car ca2 = new Car("G80");
        Car ca3 = new Car("Model Y");

        Car.showTotalCars(); //구매한 차량 수를 출력하는 static 메서드
    }
}
