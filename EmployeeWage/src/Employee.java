public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setBaseSalary(hourlyRate);
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees() {
        System.out.println(numberOfEmployees);
    }
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    private void setBaseSalary (int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be zero or less");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be zero or less");
        this.hourlyRate = hourlyRate;
    }
    private int getHourlyRate() {
        return hourlyRate;
    }
}
