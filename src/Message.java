
public class Message {
    String welcome = "Welcome to the library application";
    String mainMenuTitle = "Please select an option";
    String mainMenuOption1 = "1. List books";


    public void displayWelcomeMessage(){
        System.out.println(welcome + "\n");
    }

    public void displayMainMenu(){
        System.out.println(mainMenuTitle);
        System.out.println(mainMenuOption1);
    }
}
