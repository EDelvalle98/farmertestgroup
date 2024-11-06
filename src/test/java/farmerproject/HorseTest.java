package farmerproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class HorseTest {

    Horse horse;

    @BeforeEach
    public void setUp(){
        horse = new Horse();
    }

    @org.junit.jupiter.api.Test
    void testSetName() {
        horse.setName("Horse");
        Assertions.assertEquals("Horse", horse.getName());
    }

    @org.junit.jupiter.api.Test
    void testSetAge() {
    }

    @org.junit.jupiter.api.Test
    void testEat() {
    }

    @org.junit.jupiter.api.Test
    void testMakeNoise() {
    }
}