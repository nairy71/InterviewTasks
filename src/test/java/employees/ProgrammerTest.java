package employees;

import org.junit.Assert;
import org.junit.Test;

public class ProgrammerTest {
    private static final double NORM_HOURS = 160;
    private static final double LESS_HOURS = 80;
    private static final double MORE_HOURS = 240;
    private static final double RATE = 20000;
    private static final double EXPECTED_PERCENT = 100;
    private static final double LESS_EXPECTED_SALARY = 10000;
    private static final double MORE_EXPECTED_SALARY = 30000;

    Programmer programmer = new Programmer();

    @Test
    public void getHoursWorkedPercent() {
        programmer = new Programmer();
        programmer.setHoursWorked(NORM_HOURS);
        Assert.assertTrue(programmer.getHoursWorkedPercent() == EXPECTED_PERCENT);
    }

    @Test
    public void normalSalary() {
        checkSalary(RATE, NORM_HOURS, RATE);
    }

    @Test
    public void lessSalary() {
        checkSalary(RATE, LESS_HOURS, LESS_EXPECTED_SALARY);
    }

    @Test
    public void moreSalary() {
        checkSalary(RATE, MORE_HOURS, MORE_EXPECTED_SALARY);
    }

    private void checkSalary(double rate, double hours, double expectedSalary) {
        programmer = new Programmer();
        programmer.setRate(rate);
        programmer.setHoursWorked(hours);

        Assert.assertTrue(programmer.getSalary() == expectedSalary);
    }

}