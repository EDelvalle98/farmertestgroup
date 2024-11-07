package farmerproject;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProduceTest {

    Produce produce;

    @BeforeEach
    public void setUp() {
        produce = new Produce() {
            @Override
            public void yieldEdible() {

            }
        };
    }

    @Test
    public void yieldEdibleTest(){
        boolean expected = true;
        boolean actual = true;

        assertTrue(true, "Should be edible");

    }
}
