package factory;

public class Truck implements Delivery {
    @Override
    public void deliver() {
        System.out.println("Delivering package by TRUCK 🚚");
    }
}
