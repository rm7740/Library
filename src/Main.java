import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.startSession();
    }

    public void startSession() {
        Message message = new Message();
        Shelf shelf = new Shelf();
        message.displayWelcomeMessage();
        Scanner userInput = new Scanner(System.in);
        boolean running = true;
        while(running){
            message.displayMainMenu();
            int optionChosen = userInput.nextInt();
            switch (optionChosen) {
                case 1: shelf.showBookShelf();
                    break;
                default: message.displayErrorMessage();
                    break;
            }
        }
    }
}
