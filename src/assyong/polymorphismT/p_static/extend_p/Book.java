package assyong.polymorphismT.p_static.extend_p;

public class Book extends Item{

    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name,price);
        this.author = author;
        this.isbn = isbn;
    }

    public int getPrice(){
        return super.getPrice();
    }

    public void print(){
        System.out.println("이름:" + super.getName() + ", 가격:" + super.getPrice());
        System.out.println("-저자:" + author + ", isbn:" + isbn);
    }
}
