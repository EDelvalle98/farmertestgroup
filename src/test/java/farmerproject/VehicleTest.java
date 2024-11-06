package farmerproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VehicleTest {
    Vehicle tractor;
    Vehicle cropduster;

    @BeforeEach
    void setup(){
        tractor = new Tractor("Green", "John deer", 100000);
        cropduster = new CropDuster("Red", "Boeing Stearman PT-17 1945-1966", 5000000);
    }

    @Test
    @DisplayName("Testing Rideable implementation")
    void rideableImplementationsTest(){

        Assertions.assertTrue(tractor instanceof Rideable, "Implementation -> False (tractor)");
        Assertions.assertTrue(cropduster instanceof Rideable, "Implementation -> False (cropduster)");

        System.out.println("Rideable Implementations work");
    }

    @Test
    @DisplayName("Test AirCraft implementation")
    void airCraftImplementationTest(){

        Assertions.assertTrue(cropduster instanceof AirCraft, "Implementation -> False (tractor)");
        Assertions.assertFalse(tractor instanceof AirCraft, "Implementation -> False (cropduster)");

        System.out.println("AirCraft Implementations work");
    }

    @Test
    @DisplayName("Test set price")
    void setPriceTest(){

        double expectedT = 40000;
        double expectedC = 600000;
        tractor.setPrice(40000);
        cropduster.setPrice(600000);

        double actualT = tractor.getPrice();
        double actualC = cropduster.getPrice();


        Assertions.assertEquals(expectedT, actualT,"setPrice Method -> not working (Tractor)");
        Assertions.assertEquals(expectedC, actualC, "setPrice Method -> not working (CropDuster)");

        System.out.println("setPrice Method works");
    }

    @Test
    @DisplayName("Test NoiseMaker Implementations")
    void noiseMakerImplementations(){

        Assertions.assertTrue(tractor instanceof NoiseMaker, "Implementation -> False (tractor)");
        Assertions.assertTrue(cropduster instanceof NoiseMaker,"Implementation -> False (cropduster)");

        System.out.println("NoiseMaker Implementations work");
    }

}