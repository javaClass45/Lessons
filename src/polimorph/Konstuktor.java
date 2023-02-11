package polimorph;

public class Konstuktor {

    public static void main(String[] args) {
        Konstuktor konstuktor = new Konstuktor();

        Aa aa = konstuktor.new Aa();

        konstuktor.create();


    }


    public void create() {

        Aa aa = new Aa();

    }


    class Aa extends Bb{
        public Aa() {
            System.out.println("Aa");
        }
    }

    class Bb extends Cc{
        public Bb() {
            System.out.println("Bb");
        }
    }

    class Cc {
        public Cc() {
            System.out.println("Cc");
        }
    }

}


