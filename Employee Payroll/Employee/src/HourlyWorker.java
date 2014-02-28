/**
 *b)Hourly Worker --> salary is calculated based on hours worked and hourly wage
 *both are set at time of employment.  net salary is 5% of gross
 * @author Andrew Burkus
 *
 */
public class HourlyWorker extends Employee 
{
	private int hourlywage,
				hoursworked;
	public HourlyWorker(int hours, int wage)
	{
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
		// TODO Auto-generated method stub
		return (hourlywage * hoursworked) - (hourlywage * hoursworked * 0.95);
	}

}
