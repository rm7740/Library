import java.util.ArrayList;

public class Shelf {
    ArrayList<Book> bookShelf = new ArrayList<>();

    public String showBookShelf() {
        Book book1 = new Book();
        book1.setName("Dune");
        bookShelf.add(book1);
        String output = ("");
        for(Book thisBook : bookShelf){
            System.out.println(thisBook.getName());
            output += thisBook.getName();
        }
        return output;
    }
}
