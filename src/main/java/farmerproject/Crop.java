package farmerproject;

public class Crop {
    protected boolean hasBeenHarvested;

    public Crop(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }
    public void harvest(){
        hasBeenHarvested = true;
    }
}

