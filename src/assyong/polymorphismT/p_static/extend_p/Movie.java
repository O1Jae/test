package assyong.polymorphismT.p_static.extend_p;

public class Movie extends Item{

    private String director;
    private String actor;

    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    public int getPrice(){
        return super.getPrice();
    }

    public void print(){
        System.out.println("이름:" + super.getName() + ", 가격:" + super.getPrice());
        System.out.println("-감독:" + director + "배우:" + actor);
    }
}
