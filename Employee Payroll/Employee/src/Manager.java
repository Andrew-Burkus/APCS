
public class Manager extends Employee
{
	private int salary;
	public Manager(int x)
	{
		salary = x;
	}
	@Override
	public double grossSalary() 
	{
		return salary;
	}

	@Override
	public double netSalary() 
	{
		return salary - (salary * 0.1);
	}

}
