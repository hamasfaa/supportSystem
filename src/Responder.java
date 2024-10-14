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
        responses.put("delivery time", "The estimated delivery time is shown in the 'My Orders' section.");
        responses.put("refund", "To request a refund, please contact our support team at support@foodapp.com.");
        responses.put("account issue", "For account-related issues, please visit the 'Account Settings' section.");
        responses.put("change address", "You can change your delivery address in the 'Account Settings' section.");
        responses.put("order history", "You can view your order history in the 'My Orders' section.");
        responses.put("promo code", "You can apply promo codes at the checkout page.");
        responses.put("loyalty points", "You can check your loyalty points in the 'Rewards' section.");
        responses.put("app not working", "If the app is not working, please try restarting it or contact support.");
        responses.put("forgot password", "You can reset your password using the 'Forgot Password' link on the login page.");
        responses.put("update payment method", "You can update your payment method in the 'Payment Settings' section.");
        responses.put("contact support", "You can contact our support team at support@foodapp.com for further assistance.");
    }

    public String generateResponse(String userInput) {
        String lowerCaseInput = userInput.toLowerCase();
        for (String key : responses.keySet()) {
            if (lowerCaseInput.contains(key)) {
                return responses.get(key);
            }
        }
        return "I'm not sure how to respond to that. Can you please provide more details?";
    }
}