package doubleExtends.dependency;

public class Main {
    public static Service service;


    public static void main(String[] args) {
          service = new Service();
        service.createModel(1, "1-model");
        service.createModel(2, "2-model");
        service.createModel(3, "3-model");
        service.createModel(4, "4-model");
        service.createModel(5, "5-model");
        service.createModel(6, "6-model");
        service.createModel(7, "7-model");
        service.createModel(8, "8-model");
        service.createModel(9, "9-model");


        service.readAllModel();
        service.createModel(10, "new created model");
        service.readModel(8);
        service.updateModel(7, " new Name for model - 7");
        service.delModel(9);
        service.readAllModel();

    }



}


