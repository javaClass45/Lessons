package lambdaStream.Lesson6;

public class Users {
    private int id;
    private int phone;
    private String name;
    private int age;
    private Sex sex;
    private boolean winner;

    public Users(int id, int phone, String name, int age, Sex sex) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }


    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Users)) return false;

        Users users = (Users) o;

        if (getId() != users.getId()) return false;
        if (getPhone() != users.getPhone()) return false;
        if (getAge() != users.getAge()) return false;
        if (isWinner() != users.isWinner()) return false;
        if (getName() != null ? !getName().equals(users.getName()) : users.getName() != null) return false;
        return getSex() == users.getSex();
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getPhone();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + getAge();
        result = 31 * result + (getSex() != null ? getSex().hashCode() : 0);
        result = 31 * result + (isWinner() ? 1 : 0);
        return result;
    }
}
