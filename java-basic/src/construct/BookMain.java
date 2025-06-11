package construct;

public class BookMain {

    public static void main(String[] args) {
        Book book1 = new Book("Hello Java","Seo",0);
        Book book2 = new Book("Hello JPA","Heo",300);

        Book [] books = new Book[2];
        books[0] =  book1;
        books[1] =  book2;

        for (Book book : books) {
            System.out.println(book.title+":"+book.author+":"+book.page);
        }
    }
}
