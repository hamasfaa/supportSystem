import java.util.HashMap;
import java.util.Map;

public class Responder {
    private Map<String, String> responses;

    public Responder() {
        responses = new HashMap<>();
        responses.put("order status", "You can check your order status in the 'My Orders' section.");
        responses.put("cancel order", "To cancel an order, go to 'My Orders' and select the order you want to cancel.");
        responses.put("payment issue", "For payment issues, please contact our support team at support@foodapp.com.");
        responses.put("menu", "You can view the menu in the 'Menu' section of the app.");
    }

    public String generateResponse(String userInput) {
        String lowerCaseInput = userInput.toLowerCase();
        if (responses.containsKey(lowerCaseInput)) {
            return responses.get(lowerCaseInput);
        } else {
            return "I'm not sure how to respond to that. Can you please provide more details?";
        }
    }
}