package polimorph.crazyPolimorph;

public class Aerostat extends Baloon implements ToFly{
    @Override
    public void toFly() {
        System.out.println("toFly Aerostat");
    }
}
