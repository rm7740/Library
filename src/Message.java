
public class Message {
    String welcome = "Welcome to the library application";
    String mainMenuTitle = "Please select an option";
    String mainMenuOption1 = "1. List books";
    String invalidMenuOption = "Select a valid option!";

    public void displayWelcomeMessage(){
        System.out.println(welcome);
    }

    public void displayMainMenu(){
        System.out.println("\n");
        System.out.println(mainMenuTitle);
        System.out.println(mainMenuOption1);
    }

    public void displayErrorMessage(){
        System.out.println(invalidMenuOption);
    }
}
