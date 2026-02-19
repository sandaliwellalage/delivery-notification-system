import singleton.DatabaseConnection;
import factory.*;
import observer.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== DELIVERY SYSTEM STARTED ===\n");

        // Singleton Pattern
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        System.out.println("\nSingleton check: Same instance? " + (db1 == db2));

        // Factory Pattern
        Delivery delivery = DeliveryFactory.getDelivery("road");
        delivery.deliver();

        // Observer Pattern
        NotificationService service = new NotificationService();

        User user1 = new User("Sandali");
        User user2 = new User("Kamal");

        service.subscribe(user1);
        service.subscribe(user2);

        service.notifyUsers("Your package has been delivered!");

        System.out.println("\n=== SYSTEM FINISHED ===");
    }
}
