package farmerproject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CropRowTest {
    private CropRow cropRow;

    @BeforeEach
    public void setup() {
        cropRow = new CropRow();
}

    @Test
    public void testCropRowCanAddCrop() {
        // Given a crop row and a crop (CornStalk)
        TomatoPlant tomatoPlant = new TomatoPlant(true);

        // When the TomatoPlant is added to the crop row
        cropRow.addCrop(tomatoPlant);

        // Then the crop row should contain the TomatoPlant
        assertTrue(cropRow.getCrops().contains(tomatoPlant));
    }
    @Test
    public void testCropRowStoresMultipleTomatoPlants() {
        // Given multiple TomatoPlants
        TomatoPlant tomatoPlant1 = new TomatoPlant(true);
        TomatoPlant tomatoPlant2 = new TomatoPlant(true);

        // When multiple TomatoPlants are added to the crop row
        cropRow.addCrop(tomatoPlant1);
        cropRow.addCrop(tomatoPlant2);

        // Then the crop row should contain both TomatoPlants
        assertTrue(cropRow.getCrops().contains(tomatoPlant1));
        assertTrue(cropRow.getCrops().contains(tomatoPlant2));
    }
}
