/**
 *d)Comminsion Worker--> gets a base salary like manager plus a percent of 
 *montly sales.  Assume for project that base salary AND total sales and commision
 *rate set at time of employment.
 * @author Andrew
 *
 */
public class CommisionWorker extends Employee
{
	private double salary,
				   sales,
				   commision;
	
	public CommisionWorker(double salary, double sales, double commision, String N)
	{
		super(N);
		salary = salary;
		sales = sales;
		commision = commision;
	}

	@Override
	public double grossSalary() 
	{
		// TODO Auto-generated method stub
		return salary + (sales * commision);
	}

	@Override
	public double netSalary() 
	{
		// TODO Auto-generated method stub
		return grossSalary() - grossSalary() * 0.1;
	}

}
