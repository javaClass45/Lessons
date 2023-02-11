package interview.task119;


import java.time.LocalDate;

public class Cars  implements Comparable<Cars> {
   private LocalDate create;

    public Cars(LocalDate create) {
        this.create = create;
    }


    @Override
    public int compareTo(Cars o) {

        return this.create.compareTo(o.create);
    }

    public LocalDate getCreate() {
        return create;
    }

    public void setCreate(LocalDate create) {
        this.create = create;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "create=" + create +
                '}';
    }
}
