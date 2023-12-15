package polimorph.crazyPolimorph;

import java.awt.*;
import java.util.ArrayList;

public class MainClassPolimorph {
    public static void main(String[] args) {
        var toFlies = new ArrayList<ToFly>();

        var aerostat = new Aerostat();
        var duck = new Duck();
        var boing747 = new Boing747();
        var flyFish = new FlyFish();



        toFlies.add(aerostat);
        toFlies.add(duck);
        toFlies.add(boing747);
        toFlies.add(flyFish);

        for (ToFly list : toFlies) {
            list.toFly();
        }


    }
}
