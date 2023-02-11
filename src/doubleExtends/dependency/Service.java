package doubleExtends.dependency;

public class Service {

    public Repository repository = new Repository();

    public Service() {

    }

    public void createModel(int id, String name) {
        repository.list.add(new Model(id, name));

    }

    public void readModel(int id) {
        System.out.println(repository.list.get(id - 1));
    }

    public void readAllModel() {

        repository.list.forEach(System.out::println);

    }

    public void updateModel(int id, String name) {
        repository.list.get(id - 1).setName(name);
    }

    public void delModel(int id) {
        repository.list.remove(id - 1);
        System.out.println("удалена модель - " + id);
    }


}
