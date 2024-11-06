package farmerproject;

public abstract class FarmVehicle extends  Vehicle{

   private boolean isAFarmVehicle;

    public FarmVehicle(String color, String name, double price) {
        super(color, name, price);
        isAFarmVehicle = true;
    }

    public boolean isAFarmVehicle() {
        return isAFarmVehicle;
    }

    public void setAFarmVehicle(boolean AFarmVehicle) {
        isAFarmVehicle = AFarmVehicle;
    }
}
