
public class Manager extends Employee
{
	private double salary;
	
	public Manager(int x, String N)
	{
		super(N);
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
