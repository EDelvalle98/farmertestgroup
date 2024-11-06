package farmerproject;

public abstract class Vehicle implements Rideable, NoiseMaker{
    private String color;
    public final String NAME;
    private double price;

    public Vehicle(String color, String name, double price) {
        this.color = color;
        NAME = name;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNAME() {
        return NAME;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
