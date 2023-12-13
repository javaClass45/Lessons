package statics;

public class Man {
    private int id;

    static int counter = 1;

    public Man() {
        id = counter++;
    }

    public void displayId() {
        System.out.printf("Id: %d \n", id);
    }

}
