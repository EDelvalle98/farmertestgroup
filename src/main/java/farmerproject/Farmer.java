package farmerproject;

public class Farmer implements Rider, Botanist, Eater {
    private String name;

    public Farmer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void mount(Rideable rideable) {

    }

    @Override
    public void dismount(Rideable rideable) {

    }

    @Override
    public void plant(Crop crop, Croprow croprow) {

    }
}
