/*10. Question:
 Create base class Employee with method calculateBonus().
PermanentEmployee bonus = 25% of salary.
ContractEmployee bonus = 10% of salary.
 Print bonus using a common reference to demonstrate runtime polymorphism.
Explanation:
 Tests dynamic method dispatch where base-class reference holds subclass objects.*/

import java.util.*;

class Employee
{
	String name; 
	double salary;
	Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}

	void calculateBonus()
	{
		System.out.println("Calculate the Employee Salary bonus: ");
	}
}

class PermanentEmployee extends Employee
{
	PermanentEmployee(String name, double salary)
	{
		super(name, salary);
	}

	void calculateBonus()
	{
		double bonus = salary + salary * 25 / 100;
		System.out.println("Permanent Employee Salary with Bonus: "+ bonus);
	}
}

class ContractEmployee extends Employee
{
	ContractEmployee(String name, double salary)
	{
		super(name, salary);
	}
	void calculateBonus()
	{
		double bonus = salary + salary * 10 / 100;
		System.out.println("Contract Employee Salary with Bouns: "+ bonus);
	}
}

public class Cal_Employee_Bonus
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = sc.next();

		System.out.println("Enter the Salary: ");
		double salary = sc.nextDouble();

		Employee e = new PermanentEmployee(name, salary);
		e.calculateBonus();

		e = new ContractEmployee(name, salary);
		e.calculateBonus();
	}
}