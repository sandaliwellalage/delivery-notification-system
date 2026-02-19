package factory;

public class Ship implements Delivery {
    @Override
    public void deliver() {
        System.out.println("Delivering package by SHIP 🚢");
    }
}
