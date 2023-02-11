package ThrowExeption;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static ThrowExeption.NoException.Worker.*;


public class NoException {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            listWorkers.add(new Worker(i));

        }

//        for (Worker worker : listWorkers) {
//            System.out.println("worker = " + worker.getName() + " age-" + worker.getAge());
//        }

        listWorkers.forEach(System.out::println);

        printWorker(15);

//
//        try {
//            throw new Throwable();
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
    }

    private static void printWorker(int id) {

        try {
            Optional<Worker> worker = Optional.of(listWorkers.get(id));
            worker.ifPresent(value -> System.out.println(value.toString()));
        } catch (Throwable throwable) {
            System.out.println("worker with ID-" + id + " not present!!!");
        }


    }

    static class Worker {

        private int id;
        private String name;
        private int age;

        public static List<Worker> listWorkers = new ArrayList();

        public Worker(int id) {
            this.id = ++id;
            this.name = "worker-" + id;
            this.age = (id + 3) * 3;

        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Worker{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}


