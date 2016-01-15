import java.util.ArrayList;

public class Shelf {
    ArrayList<Book> bookShelf = new ArrayList<>();

    public String showBookShelf() {
        Book book1 = new Book();
        book1.setName("Dune");
        book1.setAuthor("Some Dude");
        book1.setYear("199x");
        bookShelf.add(book1);
        Book book2 = new Book();
        book2.setName("Hyperion");
        book2.setAuthor("Dan Something");
        book2.setYear("199x");
        bookShelf.add(book2);
        String output = ("Title\tAuthor\tYear\n");
        System.out.println("Title\tAuthor\tYear");
        for(Book thisBook : bookShelf){
            System.out.println(thisBook.getName() + "\t" + thisBook.getAuthor() + "\t" + thisBook.getYear());
            output += thisBook.getName() + "\t" + thisBook.getAuthor() + "\t" + thisBook.getYear() + "\n";
        }
        return output;
    }
}
