package polimorph.geometria;

public class Main {
    public static void main(String[] args) {
        Shape fig = new Circle();
        fig.draw();
        fig.print();
        fig.erase();

        Shape fig1 = new Triangle();
        fig1.draw();
        fig1.print();
        fig1.erase();

        Shape fig2 = new Square();
        fig2.draw();
        fig2.print();
        fig2.erase();

    }




}
