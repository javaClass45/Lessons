package polimorph.crazyPolimorph;

public class Boing747 extends AirPlane implements ToFly{
    @Override
    public void toFly() {
        System.out.println("toFly-Boing747");
    }
}
