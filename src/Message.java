
public class Message {
    String welcome = "Welcome to the library application";
    String mainMenuTitle = "Please select an option";
    String mainMenuOption1 = "1. List books";
    String mainMenuOption2 = "2. Checkout book";
    String mainMenuOption3 = "3. Quit";
    String invalidMenuOption = "Select a valid option!";
    String checkoutMenuSelectBook = "Please enter a book name";

    public void displayWelcomeMessage(){
        System.out.println(welcome);
    }

    public void displayMainMenu(){
        System.out.println("\n");
        System.out.println(mainMenuTitle);
        System.out.println(mainMenuOption1);
        System.out.println(mainMenuOption2);
        System.out.println(mainMenuOption3);
    }

    public void displayErrorMessage(){
        System.out.println(invalidMenuOption);
    }

    public void displayCheckoutMenu(){
        System.out.println(checkoutMenuSelectBook);
    }
}
