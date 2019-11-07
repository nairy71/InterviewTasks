package employees;

import org.junit.Assert;
import org.junit.Test;

public class ManagerTest {

    private static final double NORM_HOURS = 160;
    private static final double LESS_HOURS = 80;
    private static final double MORE_HOURS = 200;
    private static final double RATE = 10000;
    private static final double EXPECTED_PERCENT = 100;
    private static final double EXPECTED_SALARY = 5000;

    private Manager manager;

    @Test
    public void getHoursWorkedPercent() {
        manager = new Manager();
        manager.setHoursWorked(NORM_HOURS);

        Assert.assertTrue(manager.getHoursWorkedPercent() == EXPECTED_PERCENT);
    }

    @Test
    public void lessNormSalary() {
       checkSalary(RATE, LESS_HOURS, EXPECTED_SALARY);
    }

    @Test
    public void exceedingNormSalary() {
        checkSalary(RATE, MORE_HOURS, RATE);
    }

    @Test
    public void normSalary() {
        checkSalary(RATE, NORM_HOURS, RATE);
    }

    private void checkSalary(double rate, double hours, double expectedSalary) {
        manager = new Manager();
        manager.setRate(rate);
        manager.setHoursWorked(hours);

        Assert.assertTrue(manager.getSalary() == expectedSalary);
    }

}