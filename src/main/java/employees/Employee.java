package employees;

public abstract class Employee {

    protected static final double MONTH_NORM = 160;

    public abstract double getHoursWorkedPercent();

    public abstract double getSalary();

    public abstract void setRate(double rate);

    public abstract void setHoursWorked(double hoursWorked);

}
