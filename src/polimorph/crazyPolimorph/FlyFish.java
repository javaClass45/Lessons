package polimorph.crazyPolimorph;

public class FlyFish extends Fish implements ToFly{
    @Override
    public void toFly() {
        System.out.println("toFly FlyFish");
    }
}
