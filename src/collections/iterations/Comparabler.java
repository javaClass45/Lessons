package collections.iterations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static collections.iterations.Comparabler.Worker.*;

public class Comparabler {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            listWorkers.add(new Worker(i));
        }


        Collections.sort(listWorkers);

        listWorkers.forEach(System.out::println);

    }

    static class Worker implements Comparable<Worker> {

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

        @Override
        public int compareTo(Worker o) {
            return o.age - this.age;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Worker)) return false;

            Worker worker = (Worker) o;

            if (getId() != worker.getId()) return false;
            if (getAge() != worker.getAge()) return false;
            return getName() != null ? getName().equals(worker.getName()) : worker.getName() == null;
        }

        @Override
        public int hashCode() {
            int result = getId();
            result = 31 * result + (getName() != null ? getName().hashCode() : 0);
            result = 31 * result + getAge();
            return result;
        }
    }

}
