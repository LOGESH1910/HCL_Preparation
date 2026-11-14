. Employee Salary Processing

Problem Statement

A company payroll system maintains different types of employees. The salary calculation depends on the employee type.

Design the program using the following OOPS structure:

Requirements

1. Employee (Abstract Base Class)

Create an abstract class Employee.

Declare the following private data members:

int employeeId

String employeeName

Create a constructor to initialize these fields.

Provide getter methods:

getEmployeeId()

getEmployeeName()

Declare an abstract method:

double calculateSalary()

2. FullTimeEmployee (Derived Class)

Extend the Employee class.

Declare double monthlySalary.

Create a constructor to initialize all required values.

Override calculateSalary().

Salary = Monthly Salary.

3. ContractEmployee (Derived Class)

Extend the Employee class.

Declare the following data members:

int workingDays

double dailyRate

Create a constructor to initialize all required values.

Override calculateSalary().

Salary = Working Days × Daily Rate.

4. Runtime Polymorphism

In the main() method, use an Employee reference to refer to the appropriate derived-class object and demonstrate runtime polymorphism.

Input Format

The first line contains an integer employeeType.

1 represents a full-time employee.

2 represents a contract employee.

The second line contains:

employeeId employeeName

The third line contains:

For type 1: monthlySalary as a double.

For type 2: workingDays as an integer and dailyRate as a double.

Output Format

Print the following details:

Employee ID as an integer.

Employee Name as a string.

Salary as a double formatted to exactly two decimal places.

Constraints

1 ≤ employeeType ≤ 2

1 ≤ employeeId ≤ 100000

1 ≤ workingDays ≤ 31

0.0 < monthlySalary ≤ 1000000.0

0.0 < dailyRate ≤ 100000.0

employeeName contains only letters.

Sample Input

2
105 Arun
24 1500.0

Sample Output

Employee ID: 105
Employee Name: Arun
Salary: 36000.00
