package ssyong.thread;

class Bank{
    int money;

    synchronized public void bSave(int m, String name){
        money += m;
        System.out.println(name +"가 " + m +"원을 입금하여 " + money +"원 잔액이 남았습니다.");
    }

    synchronized public void bLoad(int m, String name){
        if (money < m){
            System.out.println(name + "님 잔액이 부족합니다.");
            return;
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        money-=m;
        System.out.println(name +"가" + m +" 원을 출금하여" + money +" 원 잔액이 남았습니다.");
    }


}
class Parent extends Thread{

    String name;
    Bank bank;

    public Parent(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
    }

    @Override
    public void run(){
        for (int i = 1; i <=5; i++){
            int saveMoney = (int)(Math.random()*5)+1*100;
            int loadMoney = (int)(Math.random()*5)+1*100;
            bank.bSave(saveMoney,name);
            bank.bLoad(loadMoney,name);
        }
    }
}
public class SyncThread {


    public static void main(String[] args) {
        Bank bank = new Bank();
        Parent mama = new Parent("mama",bank);
        Parent papa = new Parent("papa",bank);

        mama.start();
        papa.start();


    }
}
