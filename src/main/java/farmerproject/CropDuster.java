package farmerproject;

public class CropDuster extends FarmVehicle implements AirCraft{


    public CropDuster(String color, String name, double price) {
        super(color, name, price);
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public void takeOff() {
        System.out.println("Taking off prepare yourselves");
    }

    @Override
    public void landing() {
        System.out.println("wheels down were coming in for a landing");
    }

    @Override
    public boolean canBeRiden() {
        return true;
    }

    @Override
    public void ride() {
        System.out.println("yay plane ride over the crops");
    }

    @Override
    public void getOff() {
        System.out.println("hop out of the plane");
    }
}
