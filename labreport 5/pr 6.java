public class NotificationSystem {

    // Method 1: Default notification
    static void sendNotification(String message) {
        System.out.println("Broadcast Alert: " + message);
    }

    // Method 2: Email notification
    static void sendNotification(String message, String email) {
        System.out.println("Email sent to " + email + " -> " + message);
    }

    // Method 3: SMS notification
    static void sendNotification(String message, long phoneNumber) {
        System.out.println("SMS sent to +" + phoneNumber + " -> " + message);
    }

    public static void main(String[] args) {

        sendNotification("Server restart in 5 mins.");

        sendNotification("Your OTP is 4432", "user@test.com");

        sendNotification("Package delivered!", 15550199L);
    }
}