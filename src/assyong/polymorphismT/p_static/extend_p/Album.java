package assyong.polymorphismT.p_static.extend_p;

public class Album extends Item{
    private String artist;
    public Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }
    public int getPrice(){
        return super.getPrice();
    }

    public void print(){
        System.out.println("이름:" + super.getName() + ", 가격:" + super.getPrice());
        System.out.println("-아티스트:" + artist);
    }
}
