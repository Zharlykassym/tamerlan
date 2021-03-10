package kz.aitu.oop.assignment6;

public class SeaLogistics extends Logistics{
    public Transport createTransport() {return new Ship();}
    public void planDelivery () {System.out.println("The delivery address is remote and fenced off by the sea, so I choose sea delivery");}
}
