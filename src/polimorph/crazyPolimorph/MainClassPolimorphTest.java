package polimorph.crazyPolimorph;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainClassPolimorphTest {

    private ArrayList<ToFly> flyCollection;

    @Before
    public void setup() {
        flyCollection = new ArrayList<>();

        var aerostat = new Aerostat();
        var duck = new Duck();
        var boing747 = new Boing747();
        var flyFish = new FlyFish();



        flyCollection.add(aerostat);
        flyCollection.add(duck);
        flyCollection.add(boing747);
        flyCollection.add(flyFish);

    }

    @Test
    public void testForeach() {
        setup();
        int index = 0;
        for (ToFly fly : flyCollection) {
            index++;
        }
        assertEquals(4,index);

    }

}