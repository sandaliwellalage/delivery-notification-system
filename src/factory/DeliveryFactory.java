package factory;

public class DeliveryFactory {

    public static Delivery getDelivery(String type) {

        if (type.equalsIgnoreCase("road")) {
            return new Truck();
        } else if (type.equalsIgnoreCase("sea")) {
            return new Ship();
        }

        return null;
    }
}
