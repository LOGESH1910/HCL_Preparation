
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int employeeType = sc.nextInt();
        int employeeId = sc.nextInt();
        String employeeName = sc.next();

        Employee employee;

        if (employeeType == 1) {
            double monthlySalary = sc.nextDouble();

            employee = new FullTimeEmployee(
                employeeId, employeeName, monthlySalary
            );

        } else {
            int workingDays = sc.nextInt();
            double dailyRate = sc.nextDouble();

            employee = new ContractEmployee(
                employeeId, employeeName, workingDays, dailyRate
            );
        }

        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.printf("Salary: %.2f%n", employee.calculateSalary());

        sc.close();
    }
}
