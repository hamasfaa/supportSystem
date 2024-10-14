import java.util.Scanner;
import java.util.Random;

public class SupportSystem {
    private Responder responder;
    private Scanner scanner;
    private Random random;

    private String[] welcomeMessages = {
            "Welcome to the Food App Support System. Type 'bye' to exit.",
            "Hello! How can I assist you today? Type 'bye' to exit.",
            "Hi there! Need help? Type 'bye' to exit."
    };

    private String[] goodbyeMessages = {
            "Goodbye!",
            "See you next time!",
            "Take care!"
    };

    public SupportSystem() {
        responder = new Responder();
        scanner = new Scanner(System.in);
        random = new Random();
    }

    public void start() {
        System.out.println(getRandomWelcomeMessage());
        String userInput;

        do {
            System.out.print("You: ");
            userInput = scanner.nextLine();
            if (!userInput.equalsIgnoreCase("bye")) {
                String response = responder.generateResponse(userInput);
                System.out.println("Bot: " + response);
            }
        } while (!userInput.equalsIgnoreCase("bye"));

        System.out.println(getRandomGoodbyeMessage());
    }

    private String getRandomWelcomeMessage() {
        int index = random.nextInt(welcomeMessages.length);
        return welcomeMessages[index];
    }

    private String getRandomGoodbyeMessage() {
        int index = random.nextInt(goodbyeMessages.length);
        return goodbyeMessages[index];
    }
}