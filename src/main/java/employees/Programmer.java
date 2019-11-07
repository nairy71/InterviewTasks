package employees;

public class Programmer extends Employee {

    private double rate;
    private double    hoursWorked;

    @Override
    public double getHoursWorkedPercent() {

        return (hoursWorked / MONTH_NORM) * 100;
    }

    @Override
    public double getSalary() {

        return (getHoursWorkedPercent() * rate) / 100;
    }

    @Override
    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRate() {
        return rate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

}
