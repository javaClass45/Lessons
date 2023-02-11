package unitTest.salary;

/**
 * Created by Anton on 12.07.16.
 */
class Employee {
    private final String name;
    private double salary;

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {

        salary *= 1 + byPercent / 100;
    }

    public boolean setSalary(double newSalary) {
        if (newSalary < 10000) {
            return false;
        } else {
            salary = newSalary;
            return true;
        }
    }
}


public class Salary {

    public static void main(String[] args) {

        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Haug E.J.", 50000);
        staff[1] = new Employee("Adams R.A.", 60000);
        staff[2] = new Employee("Taylor A.A.", 35000);
        for (int i = 0; i < staff.length; i++) {
            System.out.println("name " + staff[i].getName() + ";" + " unitTest.salary=$" + staff[i]
                    .getSalary());
        }

        for (int i = 0; i < staff.length; i++)
            staff[i].raiseSalary(10);
        System.out.println("после повышения зарплаты!!!");

        for (int i = 0; i < staff.length; i++) {
            Employee e = staff[i];
            System.out.println("name " + e.getName() + ";" + " unitTest.salary=$" + e.getSalary());
        }
        if (staff[1].setSalary(730)) {
            Employee e = staff[1];
            System.out.println("name " + e.getName() + ";" + " unitTest.salary=$" + e.getSalary());
        } else {
            System.out.println("Error!!!");
            Employee e = staff[1];
            System.out.println("name " + e.getName() + ";" + " old unitTest.salary=$" + e.getSalary());
        }
    }
}