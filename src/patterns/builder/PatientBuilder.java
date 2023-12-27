package patterns.builder;

public interface PatientBuilder {

    PatientBuilder setName(String name);

    PatientBuilder setLast_name(String last_name);

    PatientBuilder setFirst_name(String first_name);

    PatientBuilder setAddress(String address);

    PatientBuilder setAge(int age);

    PatientBuilder setHeight(int height);

    PatientBuilder setWeight(int weight);

    Patient build();

}
