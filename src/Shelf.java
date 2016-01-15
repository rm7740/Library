import java.util.ArrayList;

public class Shelf {
    ArrayList<Book> bookShelf = new ArrayList<>();

    public String showBookShelf() {
        Book book1 = new Book();
        book1.setName("Dune");
        bookShelf.add(book1);
        Book book2 = new Book();
        book2.setName("Hyperion");
        bookShelf.add(book2);
        String output = ("");
        for(Book thisBook : bookShelf){
            System.out.println(thisBook.getName());
            output += thisBook.getName() + "\n";
        }
        return output;
    }
}
