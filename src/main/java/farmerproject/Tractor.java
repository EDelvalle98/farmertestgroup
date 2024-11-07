package farmerproject;

public class Tractor extends FarmVehicle {
    public Tractor(String color, String name, double price) {
        super(color, name, price);
    }
    public void harvest (Crop crop){}

    @Override
    public boolean canBeRiden() {
        return true;
    }

    @Override
    public void ride() {
        System.out.println("Time to use my tractor");
    }

    @Override
    public void getOff() {
        System.out.println("Getting off tractor");
    }

    @Override
    public void makeNoise() {
        System.out.println("Tractor Noises");
    }
}
