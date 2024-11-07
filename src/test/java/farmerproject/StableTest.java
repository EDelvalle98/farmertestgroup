package farmerproject;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StableTest {


    Stable stable;
    Horse horse1;

    @BeforeEach
    public void setUp(){
        stable = new Stable(new ArrayList<>());
        horse1 = new Horse();
    }
    @Test
    public void addHorseTest(){
        int expected = 1;
        stable.addHorse(horse1);

        List<Horse> actual = stable.getListOfHorses();
        assertEquals(1, actual);
    }

}
