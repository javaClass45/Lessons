package javarush.finalize;

public class Cat {
    private String name;

    static int j = 0;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Объект Cat уничтожен!" + j++);
    }



    public static void main(String[] args) {
        for (int i = 0; i <1_000_000 ; i++) {
            Cat cat = new Cat();
            cat = null;
        }




    }

}




