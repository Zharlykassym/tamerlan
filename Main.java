package kz.aitu.oop.assignment6;

public class Main {
    public static void main(String[] args) {
        Logistics one = createLogistics("Truck");
        Transport transfer = one.createTransport();
        one.planDelivery();
        transfer.deliver();
    }
    public static Logistics createLogistics(String transport){
        switch (transport) {
            case "Ship" : return new SeaLogistics();
            case "Truck" : return new RoadLogistics();
            default: return null;
        }

    }
}
