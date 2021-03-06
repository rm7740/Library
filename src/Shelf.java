import java.util.ArrayList;
import java.util.Scanner;

public class Shelf {
    ArrayList<Book> bookShelf = new ArrayList<>();
    Message message = new Message();

    public void createStock(){
        Book book1 = new Book();
        Book book2 = new Book();
        book1.setName("Dune");
        book1.setAuthor("Some Dude");
        book1.setYear("199x");
        bookShelf.add(book1);
        book2.setName("Hyperion");
        book2.setAuthor("Dan Something");
        book2.setYear("199x");
        bookShelf.add(book2);
    }

    public void showBookShelf() {
        System.out.println("Title\tAuthor\tYear");
        for(Book thisBook : bookShelf) {
            if (thisBook.getAvailable()) {
                System.out.println(thisBook.getName() + "\t" + thisBook.getAuthor() + "\t" + thisBook.getYear());
            }
        }
    }

    public void checkoutBook(){
        boolean invalidOption = true;
        while(invalidOption){
            message.displayCheckoutMenu();
            Scanner userCheckoutInput = new Scanner(System.in);
            String userGivenName = userCheckoutInput.next();
            for(Book thisBookCheckout : bookShelf){
                String theNameToCheck = thisBookCheckout.getName();
                if(theNameToCheck.equals(userGivenName)){
                    if(thisBookCheckout.getAvailable()){
                        thisBookCheckout.setAvailable(false);
                        message.displaySuccessfulCheckoutMessage();
                        invalidOption = false;
                    }
                    else{
                        message.displayUnsuccessfulCheckoutMessage();
                        invalidOption = false;
                    }
                }
            }
        }
    }

    public void returnBook(){
        boolean invalidOption = true;
        while(invalidOption){
            message.displayReturnMenu();
            Scanner userReturnInput = new Scanner(System.in);
            String userGivenName = userReturnInput.next();
            for(Book thisBookReturn : bookShelf){
                String theNameToCheck = thisBookReturn.getName();
                if(theNameToCheck.equals(userGivenName)){
                    if(!thisBookReturn.getAvailable()){
                        thisBookReturn.setAvailable(true);
                        message.displaySuccessfulReturnMessage();
                        invalidOption = false;
                    }
                    else{
                        message.displayUnsuccessfulReturnMessage();
                        invalidOption = false;
                    }
                }
            }
        }
    }
}
