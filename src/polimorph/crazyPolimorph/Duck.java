package polimorph.crazyPolimorph;

public class Duck extends Bird implements ToFly{
    private String name = "Donald";

    @Override
    public void toFly() {
        System.out.println("toFly Donald Duck");
    }
}
