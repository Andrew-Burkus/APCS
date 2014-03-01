/**
 *b)Hourly Worker --> salary is calculated based on hours worked and hourly wage
 *both are set at time of employment.  net salary is 5% of gross
 * @author Andrew Burkus
 *
 */
public class HourlyWorker extends Employee 
{
	protected double hourlywage; //protected so don't have to be redefined in parttime class
	protected double hoursworked;
	
	public HourlyWorker(int hours, int wage, String N)
	{
		super(N);
		hourlywage = wage;
		hoursworked = hours;
	}
	@Override
	public double grossSalary() 
	{		
		return hourlywage * hoursworked;
	}

	@Override
	public double netSalary() 
	{
		return grossSalary() - grossSalary() * 0.95;
	}

}
