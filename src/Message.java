
public class Message {
    String welcome = "Welcome to the library application";
    String mainMenuTitle = "Please select an option";
    String mainMenuOption1 = "1. List books";
    String mainMenuOption2 = "2. Checkout book";
    String mainMenuOption3 = "3. Return book";
    String mainMenuOption4 = "4. Quit";
    String invalidMenuOption = "Select a valid option!";
    String menuSelectBook = "Please enter a book name";
    String successfulCheckout = "Thank you! Enjoy the book";
    String unsuccessfulCheckout = "That book is not available";
    String successfulReturn = "Thank you for returning the book";

    public void displayWelcomeMessage(){
        System.out.println(welcome);
    }

    public void displayMainMenu(){
        System.out.println("\n");
        System.out.println(mainMenuTitle);
        System.out.println(mainMenuOption1);
        System.out.println(mainMenuOption2);
        System.out.println(mainMenuOption3);
        System.out.println(mainMenuOption4);
    }

    public void displayErrorMessage(){
        System.out.println(invalidMenuOption);
    }

    public void displayCheckoutMenu(){
        System.out.println(menuSelectBook);
    }

    public void displaySuccessfulCheckoutMessage(){
        System.out.println(successfulCheckout);
    }

    public void displayUnsuccessfulCheckoutMessage(){
        System.out.println(unsuccessfulCheckout);
    }

    public void displayReturnMenu(){
        System.out.println(menuSelectBook);
    }

    public void displaySuccessfulReturnMessage(){
        System.out.println(successfulReturn);
    }
}
