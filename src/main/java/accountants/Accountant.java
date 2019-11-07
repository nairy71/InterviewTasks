package accountants;

import employees.Employee;


public class Accountant {

    private Employee[] employees;

    public Accountant(Employee[] employees) {

        this.employees = employees;
    }

    public double[] calculateSalaries() {

        double[] result = new double[employees.length];

        for (int i = 0; i < employees.length; i++) {
            result[i] = employees[i].getSalary();
        }

        return result;
    }

}
