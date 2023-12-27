package patterns.builder;

public class PatientBuitImpl implements PatientBuilder {

    Patient patient = new Patient();


    @Override
    public PatientBuilder setName(String name) {
        patient.name = name;
        return this;
    }

    @Override
    public PatientBuilder setLast_name(String last_name) {
        patient.last_name = last_name;
        return this;
    }

    @Override
    public PatientBuilder setFirst_name(String first_name) {
        patient.first_name = first_name;
        return this;
    }

    @Override
    public PatientBuilder setAddress(String address) {
        patient.address = address;
        return this;
    }

    @Override
    public PatientBuilder setAge(int age) {
        patient.age = age;
        return this;
    }

    @Override
    public PatientBuilder setHeight(int height) {
        patient.height = height;
        return this;
    }

    @Override
    public PatientBuilder setWeight(int weight) {
        patient.weight = weight;
        return this;
    }

    @Override
    public Patient build() {

        return patient;
    }
}
