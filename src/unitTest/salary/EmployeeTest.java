package unitTest.salary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void raiseSalary() {
        Employee employee = new Employee("name", 1000);
      employee.raiseSalary(10.0);
        assertEquals(1100.0, employee.getSalary());

    }
}