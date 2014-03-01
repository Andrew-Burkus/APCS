/*Create a project called EmployerPayRoll to handle the payroll books
 *for a company.  The company has 4 types of workers: Managers, Comminsion Workers,
 *Hourly Workers and Part Time Workers.  
 *All of the classes should be a sub-class of the abstract class Employee.
 *Employee has a name and a get name method.  
 *Employee should implement the Employable interface that requires 2 methods
 *double grossSalary();
 *double netSalary();
 *
 *Description of workers:
 *a) Managers--> Gross salary is salary, net salary is 10% less than 
 *gross (taxes and benefits) salary is set at time of employement
 *b)Hourly Worker --> salary is calculated based on hours worked and hourly wage
 *both are set at time of employemnt.  net salary is 5% of gross
 *c)Part Time --> hourly worker with no deduction for net.  Can not work over 
 *20 hours. Part-Time employee should be a subclass of Hourly Employee.
 *d)Comminsion Worker--> gets a base salary like manager plus a percent of 
 *montly sales.  Assume for project that base salary AND total sales and commision
 *rate set at time of employment.
 *EmployerPayRoll should have an array of Employables.  It should have a 
 *print payroll method to calculate the montly gross and net salaries and print a list of 
 *them along with the name, gross salaray, and net salary for each worker.
 *Create a test class to thoroughly test your project.
 */
public abstract class Employee implements Employable
{
	private String name;
	
	public Employee(String a)
	{
		name = a;
	}
	
	public String getName()
	{
		return this.name;
	}
}
