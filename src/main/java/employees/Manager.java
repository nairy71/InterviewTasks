package employees;

public class Manager extends Employee {

    private double    rate;
    private double    hoursWorked;

    @Override
    public double getHoursWorkedPercent() {

        return (hoursWorked / MONTH_NORM) * 100;
    }

    @Override
    public double getSalary() {

        double  result;
        boolean isNormComplete = hoursWorked >= MONTH_NORM;

        if (isNormComplete) {
            result = rate;
        } else {
            result = (getHoursWorkedPercent() * rate) / 100;
        }

        return result;
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
