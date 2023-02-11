package patterns.Observ;

public class ObserverTest {
    public static void main(String[] args) {
        University university = new University();
        Director director = new Director();
        university.addStudent("Petro");
        university.addObserver(director);
        university.addStudent("AnnaLennaBerbok");
        university.removeStudent("Petro");
    }
}
