package farmerproject;

import java.util.ArrayList;
import java.util.List;

public class CropRow {
    private List<Crop> crops = new ArrayList<>();

    public void addCrop(Crop crop) {
        crops.add(crop);
    }

    public List<Crop> getCrops() {
        return crops;
    }
}
