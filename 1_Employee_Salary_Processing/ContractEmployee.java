
public class ContractEmployee extends Employee {

    private int workingDays;
    private double dailyRate;

    public ContractEmployee(int employeeId, String employeeName,
                            int workingDays, double dailyRate) {
        super(employeeId, employeeName);

        if (workingDays <= 0 || dailyRate <= 0) {
            throw new IllegalArgumentException("Invalid contract details");
        }

        this.workingDays = workingDays;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateSalary() {
        return workingDays * dailyRate;
    }
}
