class Book{
    String title;
    double price;
    void Book(){
        title = "Unknown";
        price = 0.0;
    }
    void Book(String title){
        title = this.title;
        price = 0.0;
    }
    void Book(String title, double price){
        title = this.title;
        price = this.price;
    }
    void display(){
        System.out.println("Title of the book : "+title);
        System.out.println("Price of the Book is : "+price+"\n");
    }
}

public class Task6 {
    public static void main(String[] args) {
        Book b =new Book();
        b.Book();
        b.display();
        b.Book("True Pain of Men");
        b.display();
        b.Book("True Pain of Men", 150);
        b.display();
    }
}
