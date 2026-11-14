Assessment 1 – Core Java Checkpoint
OOPS Design 
________________________________________
1. Employee Salary Processing
Problem Statement
A company payroll system maintains different types of employees. The salary calculation depends on the employee type.
Design the program using the following OOPS structure:
•	Create an abstract base class Employee.
•	The Employee class must contain the following private data members:
o	int employeeId
o	String employeeName
•	Create a constructor in Employee to initialize these fields.
•	Provide the following getter methods:
o	int getEmployeeId()
o	String getEmployeeName()
•	Declare an abstract method:
o	double calculateSalary()
•	Create the following derived classes:
o	FullTimeEmployee
o	ContractEmployee
FullTimeEmployee
•	It must contain double monthlySalary.
•	Create a constructor to initialize all required values.
•	Override calculateSalary().
•	Salary = Monthly Salary
ContractEmployee
•	It must contain:
o	int workingDays
o	double dailyRate
•	Create a constructor to initialize all required values.
•	Override calculateSalary().
•	Salary = Working Days × Daily Rate
In the main() method, use an Employee reference to refer to the appropriate derived-class object and demonstrate runtime polymorphism.
Input Format
The first line contains an integer employeeType.
•	1 represents a full-time employee.
•	2 represents a contract employee.
The second line contains:
employeeId employeeName
The third line contains:
•	For type 1: monthlySalary as a double.
•	For type 2: workingDays as an integer and dailyRate as a double.
Output Format
Print:
•	Employee ID as an integer.
•	Employee Name as a string.
•	Salary as a double formatted to exactly two decimal places.
Constraints
•	1 ≤ employeeType ≤ 2
•	1 ≤ employeeId ≤ 100000
•	1 ≤ workingDays ≤ 31
•	0.0 < monthlySalary ≤ 1000000.0
•	0.0 < dailyRate ≤ 100000.0
•	employeeName contains only letters.
Sample Input
2
105 Arun
24 1500.0
Sample Output
Employee ID: 105
Employee Name: Arun
Salary: 36000.00
