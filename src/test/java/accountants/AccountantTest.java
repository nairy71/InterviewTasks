package accountants;

import employees.Employee;
import employees.Manager;
import employees.Programmer;
import org.junit.Assert;
import org.junit.Test;

public class AccountantTest {

    private static int    PROGRAMMER_RATE = 50000;
    private static int    MANAGER_RATE = 25000;
    private static double PROGRAMMER_HOURS = 240;
    private static double MANAGER_HOURS = 160;
    private static double EXPECTED_SUM_SALARIES = 100_000;
    private static int    COUNT_OF_EMPLOYEES = 2;

    @Test
    public void calculateSalaries() {

        double     actualSumSalaries = 0;
        Accountant accountant;
        Employee[] employees;
        Programmer programmer = new Programmer();
        Manager    manager = new Manager();

        programmer.setRate(PROGRAMMER_RATE);
        programmer.setHoursWorked(PROGRAMMER_HOURS);
        manager.setRate(MANAGER_RATE);
        manager.setHoursWorked(MANAGER_HOURS);
        employees = new Employee[COUNT_OF_EMPLOYEES];
        employees[0] = programmer;
        employees[1] = manager;
        accountant = new Accountant(employees);

        for (double salary : accountant.calculateSalaries()) {
            actualSumSalaries += salary;
        }

        Assert.assertTrue(actualSumSalaries == EXPECTED_SUM_SALARIES);
    }

}