// the object from which all in-game objects are based
import java.lang.Math;
public class AnimeBall extends Ball  
{
	protected int direction;
	protected int state;
	protected AnimeBall(double x, double y, double startingVelocityX, double startingVelocityY, int mySpeed, int myState)
	{
		super(x,y,startingVelocityX,startingVelocityY,mySpeed);
		state = myState;
		//Anime();
	}
	protected AnimeBall(double x, double y, int mySpeed, int myState)
	{
		super(x,y,mySpeed);
		state = myState;
		//Anime();
	}
	
	public void act()
	{
		move();
		//Anime();
	}
	
	public void Anime()
	{
		state = state + 1;
		if (state >= 5)
		{
			state = 0;
		}
		if (VelocityY > 0)
		{
			// top
			if (VelocityX > 0)
			{
				// LEFT
				direction = 1;
			}
			else if (VelocityX < 0)
			{
				// Right
				direction = 2;
				
			}
			else
			{
				//vertical
				direction = 3;
				
			}
		}
		else if (VelocityY < 0)
		{
			// Bot
			if (VelocityX > 0)
			{
				// LEFT
				direction = 6;
				
			}
			if (VelocityX < 0)
			{
				// Right
				direction = 5;
				
			}
			else
			{
				//vertical
				direction = 4;
				
			}
		}
		else
		{
			//horizontal
		}



		
	}
	
	public int getdirection()
	{
		return direction;
	}
	public int getState()
	{
		return state;
	}
}

/**
RUN OUTPUT:

*/