package farmerproject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChickenTest {

    Chicken chicken;

    @BeforeEach
    public void setUp(){
        chicken = new Chicken();
    }

    @Test
    void yieldEdible() {
        chicken.yieldEdible();
    }

    @Test
    void eat() {
        chicken.eat();
    }

    @Test
    void makeNoise() {
        chicken.makeNoise();
    }
}