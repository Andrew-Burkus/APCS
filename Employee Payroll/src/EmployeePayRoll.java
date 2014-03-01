/**
 *EmployerPayRoll should have an array of Employees.  It should have a 
 *print payroll method to calculate the monthly gross and net salaries and print a list of 
 *them along with the name, gross salary, and net salary for each worker.
 *Create a test class to thoroughly test your project.
 *
 *@author Andrew Burkus
 *Chapter 11 Final Project
 *Working Version 
 */
import java.util.*;
public class EmployeePayRoll 
{
	public static double monthlygross;
	public static double monthlynet;
	
	public static void payRoll(Employee[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			monthlygross += array[i].grossSalary();
			monthlynet += array[i].netSalary();
		}
	}
	public static void main(String [] args)
	{
		Employee [] Employees = new Employee [4];
		
		Employees[0] = new Manager(50, "Max"); 
		Employees[1] = new HourlyWorker(10, 5, "Sam");
		Employees[2] = new PartTime(15, 10, "Bob");
		Employees[3] = new CommisionWorker(50, 30, 0.5, "Eric");
		
		payRoll(Employees);
		
		System.out.println(monthlygross + "" + monthlynet);
		
		for(int j = 0; j < Employees.length; j++)
		{
			System.out.println(Employees[j].getName());
		}
	}
}
