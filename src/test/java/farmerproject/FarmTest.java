package farmerproject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FarmTest {

    private Farm farm;

        @BeforeEach
        public void setup() {
            farm = new Farm(new FarmHouse());
        }

        @Test
        public void testFarmCanAddStable() {
            // Given a new stable
           Horse horse1 = new Horse();
           Horse horse2 = new Horse();
            Stable stable = new Stable(new ArrayList<>());
            stable.addHorse(horse1);
            stable.addHorse(horse2);

            // When the stable is added to the farm
            farm.addStable(stable);

            // Then the farm should contain the stable
            assertTrue(farm.getStables().contains(stable));
        }

    @Test
    public void testFarmCanAddChickenCoop() {
        // Given a new chicken
        Chicken chicken = new Chicken();

        // When the chicken is added to the farm
        farm.addChicken(chicken);

        // Then the farm should contain the chicken coop
        assertTrue(farm.getChickens().contains(chicken));
    }
}
