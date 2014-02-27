import info.gridworld.actor.Bug;


public class ZBug extends Bug
{
	private int steps,
				length,
				done;
	
	ZBug(int x)
	{
		steps = 0;
		length = x;
		this.setDirection(90);
	}
	
	public void act()
	{
		if(!this.canMove())
			return;
		if(done == 2)//"tracks" variable done to know when to stop
			return;
		
		if(this.getDirection() == 90)
		{
			if(steps < length)
			{
				move();
				steps++;
			}
			else
			{
				if(done == 1)//prevents bug from turning in final iteration
					return;
				
				this.setDirection(225);
				steps = 0;
				++done;//increments done, after two iterations, will trigger break of function
			}
		}
		
		else if(this.getDirection() == 225)
		{
			if(steps < length)
			{
				move();
				steps++;
			}
			else
			{
				this.setDirection(90);
				steps = 0;
			}
		}
	}
}
