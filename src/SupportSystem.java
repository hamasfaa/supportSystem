import java.util.Scanner;

public class SupportSystem {
    private Responder responder;
    private Scanner scanner;

    public SupportSystem() {
        responder = new Responder();
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the Food App Support System. Type 'bye' to exit.");
        String userInput;

        do {
            System.out.print("You: ");
            userInput = scanner.nextLine();
            if (!userInput.equalsIgnoreCase("bye")) {
                String response = responder.generateResponse(userInput);
                System.out.println("Bot: " + response);
            }
        } while (!userInput.equalsIgnoreCase("bye"));

        System.out.println("Goodbye!");
    }
}