package assyong.polymorphismT.p_static.palpay;

abstract class PayStore {
    public static Pay foundPay(String option){
        if (option.equals("kakao")){
            return new KakaoPay();
        }else if (option.equals("naver")){
            return new NaverPay();
        }else {
            return new DefaultPay();
        }
    }
}
